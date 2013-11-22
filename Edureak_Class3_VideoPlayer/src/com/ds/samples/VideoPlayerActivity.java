package com.ds.samples;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoPlayerActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		VideoView vv = (VideoView) findViewById(R.id.vv);
		
		Uri path = Uri.parse("android.resource://"+ getPackageName().toString()+ "/" + R.raw.video);
		
		vv.setVideoURI(path);
		vv.setMediaController(new MediaController(this));
		//vv.requestFocus();
		vv.start();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}