package com.example.edurekahelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private Button button1;
	private Button button2;
	private Button button3;
	private ImageView image;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1=(Button)findViewById(R.id.button1);
		button2=(Button)findViewById(R.id.button2);
		button3=(Button)findViewById(R.id.button3);
		
	
		
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				image.setBackgroundResource(R.drawable.android2);
			}
		});
		
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				image.setBackgroundResource(R.drawable.android3);
			}
		});
		
		
		button3.setOnLongClickListener(new OnLongClickListener(){
			public boolean onLongClick(View v){
				image.setBackgroundResource(R.drawable.android1);
				return false;
			}
		});		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
