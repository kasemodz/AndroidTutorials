package com.example.edureka_class3_assignment;



import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends Activity {
	private Button signIn;
	private EditText editName;
	private EditText editPass;
	private EditText editPass2;
	private TextView textSet;
	private Spinner spinner;

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		
		signIn = (Button) findViewById(R.id.button1);
		editName = (EditText) findViewById(R.id.editText1);
		editPass = (EditText) findViewById(R.id.editText2);	
		editPass2 = (EditText) findViewById(R.id.editText3);
		editPass.setError("Please input a password");
		editPass2.setError("Please re-enter password");
		spinner = (Spinner) findViewById(R.id.spinner1);
		textSet = (TextView) findViewById(R.id.textView4);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		R.array.music_choices, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);


		signIn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				String username = editName.getText().toString();
				String Pass = editPass.getText().toString();
				String Pass2 = editPass2.getText().toString();
				String music = String.valueOf(spinner.getSelectedItem());
				if(Pass.equals(Pass2)){
					
					SharedPreferences settings = getSharedPreferences(username,0);
					SharedPreferences.Editor editor = settings.edit();
					editor.putString("username", username);
					editor.putString("password", Pass);
					editor.putString("musicgenre", music);
					editor.commit();
					finish();
					
				}
				else{
					falsepass();
				}

			}
			
			
		});
		

			
}



private void falsepass(){
	Toast.makeText(this, "Your passwords don't match, try again.", Toast.LENGTH_SHORT).show();
}
}
