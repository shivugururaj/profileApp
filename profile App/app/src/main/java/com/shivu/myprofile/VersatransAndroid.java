package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class VersatransAndroid extends Activity {


	WebView ourBrow;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.copartandroidapp);
		
		ourBrow= (WebView)findViewById(R.id.appBrowser);
		//set youtube videos playing
		ourBrow.getSettings().setJavaScriptEnabled(true);
		
		ourBrow.getSettings().setLoadWithOverviewMode(true);
		ourBrow.getSettings().setUseWideViewPort(true);
		ourBrow.setWebViewClient(new ourViewClient());
		try {
			ourBrow.loadUrl("https://play.google.com/store/apps/details?id=com.tyler.versatrans.mystop");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}




	
	
	
}
