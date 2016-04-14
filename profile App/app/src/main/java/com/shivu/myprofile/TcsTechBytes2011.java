package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class TcsTechBytes2011 extends Activity {
	ImageView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tcs2011);
	        display=(ImageView)findViewById(R.id.tcs2011);
	 }
}
