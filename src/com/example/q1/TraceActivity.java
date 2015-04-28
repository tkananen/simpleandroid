package com.example.q1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class TraceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i("Tracer", "On Create Executed, traceactivity");
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.i("Tracer", "On Start Executed, traceactivity");
		
	}
	
	@Override 
	protected void onResume(){
		super.onResume();
		Log.i("Tracer", "On Resume Executed, traceactivity");	
		
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.i("Tracer", "On Pause Executed, traceactivity");
		
	}
	
	@Override
	protected void onStop(){
		super.onStop();
		Log.i("Tracer", "On Stop Executed, traceactivity");
	
	}
	
	@Override 
	protected void onRestart(){
		super.onRestart();
		Log.i("Tracer", "On Restart Executed, traceactivity");
		
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i("Tracer", "On Destroy Executed, traceactivity");
		
	}
	
	
	
}
