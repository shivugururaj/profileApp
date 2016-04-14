package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class MyWindowsApp extends Activity {

	
	WebView ourBrow;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.windowsapp);
		
		ourBrow= (WebView)findViewById(R.id.winBrowser);
		//set youtube videos playing
		ourBrow.getSettings().setJavaScriptEnabled(true);
		
		ourBrow.getSettings().setLoadWithOverviewMode(true);
		ourBrow.getSettings().setUseWideViewPort(true);
		ourBrow.setWebViewClient(new ourViewClient());
		try {
			ourBrow.loadUrl("http://www.windowsphone.com/en-gb/store/app/bangalore-infirmary/3a3b7086-c62f-46bc-be8c-3ac607aeefe3");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}




	
	
	
}
