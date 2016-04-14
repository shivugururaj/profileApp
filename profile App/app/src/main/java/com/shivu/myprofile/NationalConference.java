package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class NationalConference extends Activity {
	ImageView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.nationalconf);
	        display=(ImageView)findViewById(R.id.nationalconf);
	 }
}
