package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactDetails extends Activity {
	TextView display;
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.contact);
	        display=(TextView)findViewById(R.id.contact);
	 }
}
