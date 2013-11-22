package com.edureka;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ranking extends ListActivity {

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, RANKS));
      getListView().setTextFilterEnabled(true);
        
    }
    
    static final String[] RANKS = new String[]{
    	"1",
    	"2",
    	"3",
    	"4",
    	"5",
    	"6",
    	"7",
    	"8"
    };
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	Object o = l.getItemAtPosition(position);
    	String Rank = o.toString();
    
    	Intent data = new Intent();
    	data.putExtra("SelectedRank",Rank);
    	setResult(RESULT_OK,data);    	
    	finish();
    }

}
