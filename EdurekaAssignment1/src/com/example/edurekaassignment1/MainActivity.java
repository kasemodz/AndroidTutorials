package com.example.edurekaassignment1;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private Button PreviewButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		PreviewButton=(Button)findViewById(R.id.PreviewButton);
		EditText textname = (EditText)findViewById(R.id.editName);
		final String name = textname.getText().toString();
		EditText textdob = (EditText)findViewById(R.id.editDOB);
		final String dob = textname.getText().toString();
		
		PreviewButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
		        Intent prev = new Intent(MainActivity.this, Prev.class);
		        prev.putExtra("name", name);
		        prev.putExtra("dob", dob);
		        startActivity(prev);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
