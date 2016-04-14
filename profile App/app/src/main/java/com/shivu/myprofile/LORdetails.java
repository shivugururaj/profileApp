package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class LORdetails extends Activity {
	
	TextView d2;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lors);
		
		
	TabHost th = (TabHost)findViewById(R.id.tabhost);
	th.setup();
	TabSpec specs = th.newTabSpec("tag1");
	specs.setContent(R.id.patil);
	specs.setIndicator("LOR1");
	th.addTab(specs);
	  d2=(TextView)findViewById(R.id.patil);
	
	specs = th.newTabSpec("tag2");
	specs.setContent(R.id.pushpa);
	specs.setIndicator("LOR2");
	th.addTab(specs);
	

	specs = th.newTabSpec("tag3");
	specs.setContent(R.id.bharati);
	specs.setIndicator("LOR3");
	th.addTab(specs);
	
}}
