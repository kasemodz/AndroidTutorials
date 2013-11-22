package com.edureka;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CallingActivity extends Activity {

	public static final int COUNTRYSELECTION = 1;
	public static final int RANKSELECTION = 2;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callingactivity);
        
        try {
            Button Countries = (Button)findViewById(R.id.SelectCountry);
            Countries.setOnClickListener(new OnClickListener() {
            	
            	public void onClick(View v){
            		Intent countryIntent = new Intent(CallingActivity.this,CountryActivity.class);
            		//countryIntent.setClass();
            		startActivityForResult(countryIntent,COUNTRYSELECTION);
            	}
            });
        } catch (ActivityNotFoundException anfe) {
        	Log.e("onCreate", "Activity Not Found", anfe);
        }
        
        
        try {
            Button rank = (Button)findViewById(R.id.SelectState);
            rank.setOnClickListener(new OnClickListener() {
            	
            	public void onClick(View v){
            		Intent penIntent = new Intent();
            		penIntent.setClass(CallingActivity.this,Ranking.class);
            		startActivityForResult(penIntent,RANKSELECTION);
            	}
            });
        } catch (ActivityNotFoundException anfe) {
        	Log.e("onCreate", " Activity Not Found", anfe);
        }
    }

//    protected void start(Intent intent) {
//    	this.startActivityForResult(intent,COUNTRYSELECTION);
//    }
    
    
   
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
    	switch(requestCode) {
    	case COUNTRYSELECTION: 
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("SelectedCountry");
                Toast.makeText(this, "You have chosen the Country: " + " " + name, Toast.LENGTH_LONG).show();
                break;
            }
    	case RANKSELECTION:
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("SelectedRank");
                Toast.makeText(this, "You have chosen the Rank: " + " " + name, Toast.LENGTH_LONG).show();
                break;
            }
    	}
 
	}   

}