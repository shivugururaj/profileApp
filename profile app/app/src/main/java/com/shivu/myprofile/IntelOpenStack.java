package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class IntelOpenStack extends Activity {


	WebView ourBrow;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.copartwebsite);

		ourBrow= (WebView)findViewById(R.id.appBrowser);
		//set youtube videos playing
		ourBrow.getSettings().setJavaScriptEnabled(true);

		ourBrow.getSettings().setLoadWithOverviewMode(true);
		ourBrow.getSettings().setUseWideViewPort(true);
		ourBrow.setWebViewClient(new ourViewClient());
		try {
			ourBrow.loadUrl("https://software.intel.com/en-us/articles/open-source-openstack");

		} catch (Exception e) {
			e.printStackTrace();
		}







	}
}
