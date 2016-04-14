package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class CivilDefenceVolunteer extends Activity {
	ImageView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.cdv);
	        display=(ImageView)findViewById(R.id.cdv);
	 }
}
