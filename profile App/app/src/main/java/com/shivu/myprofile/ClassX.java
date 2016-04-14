package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ClassX extends Activity{
	TextView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.classx);
	        display=(TextView)findViewById(R.id.classx);
	 }

}
