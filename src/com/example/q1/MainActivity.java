package com.example.q1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends TraceActivity {
	
	Button myButton;
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		Log.i("Trace", "On Create Executed, MainActivity");
		
	
		
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	
	
		myButton = (Button) findViewById(R.id.nextButton);
		myButton.setOnClickListener(new View.OnClickListener(){
		
			@Override
		public void onClick(View V){

		Intent myIntent = new Intent(MainActivity.this, ActivityTwo.class);
		startActivity(myIntent);
		};
			
	
	});
	}
		
		
	
	
	
	
	
}
