package com.edureka;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CountryActivity extends ListActivity {

		
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ArrayList<String> arr_list = new ArrayList<String>();
        arr_list.add("India");
        arr_list.add("Australia");
        arr_list.add("England");
        
        
       setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arr_list));
       getListView().setTextFilterEnabled(true);

       //arr_list.clear();
       
    }
    

    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    
    	
    	Object o = this.getListAdapter().getItem(position);
    	String country = o.toString();
    	
    	Intent data = new Intent();
    	
    	data.putExtra("SelectedCountry",country);
    	setResult(RESULT_OK,data);    	
    	finish();
    }
}



// back up

//
//package com.edureka;
//
//import android.app.ListActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//public class CountryActivity extends ListActivity {
//
//		
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setListAdapter(new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, COUNTRIES));
//       getListView().setTextFilterEnabled(true);
//        
//    }
//    
//     final String[] COUNTRIES = new String[]{
//    	"India",
//    	 "Australia",
//    	 "England",
//    	"Pakistan",
//    	"South Africa",
//    	"New Zealand",
//    	"West Indies",
//    	"Sri Lanka",
//    	
//    };
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//    	super.onListItemClick(l, v, position, id);
//    
//    	Object o = this.getListAdapter().getItem(position);
//    	String country = o.toString();
//    	
//    	Intent data = new Intent();
//    	
//    	data.putExtra("SelectedCountry",country);
//    	setResult(RESULT_OK,data);    	
//    	finish();
//    }
//}
