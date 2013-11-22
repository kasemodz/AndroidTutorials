package com.example.mediamusiclistview;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**
	     * Listing 8-35: Accessing the Media Store Content Provider
	     */
	    // Get a Cursor over every piece of audio on the external volume, 
	    // extracting the song title and album name.
	    String[] projection = new String[] {
	      MediaStore.Audio.AudioColumns.ALBUM,
	      MediaStore.Audio.AudioColumns.TITLE
	    };
	  
	    Uri contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
	  
	    Cursor cursor = 
	      getContentResolver().query(contentUri, projection, 
	                                 null, null, null); 
	  
	    // Get the index of the columns we need.
	    int albumIdx =
	      cursor.getColumnIndexOrThrow(MediaStore.Audio.AudioColumns.ALBUM);
	    int titleIdx = 
	      cursor.getColumnIndexOrThrow(MediaStore.Audio.AudioColumns.TITLE);
	  
	    // Create an array to store the result set.
	    String[] result = new String[cursor.getCount()];
	  
	    // Iterate over the Cursor, extracting each album name and song title.
	    while (cursor.moveToNext()) {
	      // Extract the song title.
	      String title = cursor.getString(titleIdx);
	      // Extract the album name.
	     // String album = cursor.getString(albumIdx);
	  
	     // result[cursor.getPosition()] = title + " (" + album + ")";
	      result[cursor.getPosition()] = title + "/n";
	   
	    } 
	  
	    // Close the Cursor.
	    cursor.close();

	    //
	}



}
