package com.example.edureka_class3_assignment;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MetalActivity extends Activity {
	
	MediaPlayer mp;
	Button signOut;
	
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.metalactivity);
		
		signOut = (Button) findViewById(R.id.button1);
		
		mp = MediaPlayer.create(this, R.raw.metal);
		mp.start();
		
		signOut.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				mp.stop();
				finish();
			}
			
		});


	}
}
