package com.example.edureka_class3_assignment;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button signIn;
	private EditText editName;
	private EditText editPass;
	private TextView textSet;
	private Button signUp;
	private String text1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		signIn = (Button) findViewById(R.id.button1);
		editName = (EditText) findViewById(R.id.editText1);
		editPass = (EditText) findViewById(R.id.editText2);
		signUp = (Button) findViewById(R.id.button2);
		editPass.setError("Please input a password");
		textSet = (TextView) findViewById(R.id.textView3);
		
		
		signUp.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				Intent i = new Intent(getApplicationContext(),SignUpActivity.class);
				startActivity(i);
			}
			
		});
		
		signIn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				
				String username = editName.getText().toString();
				String Pass = editPass.getText().toString();
				String Checkpass;
				String musicgenre;
				
				SharedPreferences settings = getSharedPreferences(username,0);
				Checkpass=settings.getString("password", "null");
				musicgenre=settings.getString("musicgenre", "null");
				if(Checkpass.equals(Pass)){
					if(musicgenre.equals("Jazz")){
					Intent i = new Intent(getApplicationContext(),JazzActivity.class);
					startActivity(i);
					}
					else if (musicgenre.equals("Metal")){
					Intent i = new Intent(getApplicationContext(),MetalActivity.class);
					startActivity(i);						
					}
					else if (musicgenre.equals("Rock")){
					Intent i = new Intent(getApplicationContext(),RockActivity.class);
					startActivity(i);						
					}	
					else if (musicgenre.equals("Bollywood")){
					Intent i = new Intent(getApplicationContext(),BollywoodActivity.class);
					startActivity(i);						
					}					
				}
				else{
					falsepass();
				}
				
			}
			
		});
		

	}

	
	private void falsepass(){
		Toast.makeText(this, "Your username and/or password don't match, try again.", Toast.LENGTH_LONG).show();
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
