package com.hisham.edureka.batch_audio;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AudioPlayer extends Activity implements OnClickListener {

	/** Called when the activity is first created. */

	MediaPlayer mp;
	Boolean status = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_audio_player);

		Button play = (Button) findViewById(R.id.buttonPlay);
		Button stop = (Button) findViewById(R.id.buttonStop);

		play.setOnClickListener(this);
		stop.setOnClickListener(this);

	}

	// private boolean stopped = false;

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.buttonPlay:

			if (status == true) {
				mp.stop();
				status = false;
			}
			status = true;
			mp = MediaPlayer.create(this, R.raw.song_heer);

			mp.start();

			break;

		case R.id.buttonStop:

			mp.stop();
			// stopped = true;
		}

	}
}