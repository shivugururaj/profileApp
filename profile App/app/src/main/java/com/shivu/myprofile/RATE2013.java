package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RATE2013 extends Activity {
	TextView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.rate2013);
	        display=(TextView)findViewById(R.id.rate2013);
	 }
}
