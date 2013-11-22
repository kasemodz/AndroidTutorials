package com.example.edureka_class3_sharedpref;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button signIn;
	private EditText editName;
	private EditText editPass;
	private TextView textSet;
	private CheckBox cbSave;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		signIn = (Button) findViewById(R.id.button1);
		editName = (EditText) findViewById(R.id.editText1);
		editPass = (EditText) findViewById(R.id.editText2);
		cbSave = (CheckBox) findViewById(R.id.checkBox1);
		editPass.setError("Please input a password");
		textSet = (TextView) findViewById(R.id.textView3);
		readCred();
		signIn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				if(cbSave.isChecked()){
					
					SharedPreferences settings = getSharedPreferences("userInput",0);
					SharedPreferences.Editor editor = settings.edit();
					editor.putString("username", editName.getText().toString());
					editor.putString("password", editPass.getText().toString());
					editor.commit();
				}
			}
			
		});
	}

	
	private void readCred(){
		SharedPreferences settings = getSharedPreferences("userInput",0);
		textSet.setText(settings.getString("username", "default") + " " + 
		settings.getString("password", "defpass"));
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
