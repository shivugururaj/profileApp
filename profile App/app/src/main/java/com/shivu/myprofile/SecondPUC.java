package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPUC extends Activity{
	TextView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.secondpuc);
	        display=(TextView)findViewById(R.id.secondpuc);
	 }
}
