package com.shivu.myprofile;

import com.shivu.myprofile.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.GridLayout.Spec;
import android.widget.TabHost.TabSpec;

public class Tabs extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs);
	TabHost th = (TabHost)findViewById(R.id.tabhost);
	th.setup();
	TabSpec specs = th.newTabSpec("tag1");
	specs.setContent(R.id.tab1);
	specs.setIndicator("StopWatch");
	th.addTab(specs);
	
	specs = th.newTabSpec("tag2");
	specs.setContent(R.id.tab2);
	specs.setIndicator("Tab2");
	th.addTab(specs);
	

	specs = th.newTabSpec("tag3");
	specs.setContent(R.id.tab3);
	specs.setIndicator("Add a tab");
	th.addTab(specs);
	
	
	}


	
	
}
