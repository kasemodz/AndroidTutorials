package com.example.edurekaassignment1;





import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Prev extends Activity {
		public String prevname;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preview);
		Bundle extras = getIntent().getExtras();
		
		    String name = extras.getString("name");
		    String dob = extras.getString("dob");
		
		
		TextView text = (TextView)findViewById(R.id.textView1);
		text.setText(name);
		
		TextView text2 = (TextView)findViewById(R.id.textView2);
		text.setText(dob);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
