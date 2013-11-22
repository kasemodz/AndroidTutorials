package com.edureka.dateandtimepicker;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	Button btndatePicker;
	Button btntimePicker;
	
	DatePickerDialog _date;
	TimePickerDialog _time;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btndatePicker = (Button)findViewById(R.id.button1);
		btntimePicker = (Button)findViewById(R.id.button2);
		
		btndatePicker.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				_date = new DatePickerDialog(MainActivity.this, dateCall, 2012, 11, 23);
				_date.show();
			}
		});
		
		btntimePicker.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				_time =  new TimePickerDialog(MainActivity.this, timeCallBack, 02, 18, false);
				_time.show();
			}
		});
	}

	private TimePickerDialog.OnTimeSetListener timeCallBack = new OnTimeSetListener() {
		
		@Override
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "The time selected is : "+hourOfDay+ ":" +minute, Toast.LENGTH_SHORT).show();
		}
	};
	
	private DatePickerDialog.OnDateSetListener dateCall = new OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "The date selected is : "+ dayOfMonth +"/" + ++monthOfYear + "/" + year, Toast.LENGTH_SHORT).show();
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
