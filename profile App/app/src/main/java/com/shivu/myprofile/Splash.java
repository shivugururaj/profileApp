package com.shivu.myprofile;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

	MediaPlayer startingMusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//full screen
				requestWindowFeature(Window.FEATURE_NO_TITLE);
				getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
						WindowManager.LayoutParams.FLAG_FULLSCREEN);
				//----
		
		
		setContentView(R.layout.splash);
		startingMusic = MediaPlayer.create(Splash.this,R.raw.first);
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music = getPrefs.getBoolean("checkbox", true);
		if(music==true)
		{
		startingMusic.start();
		}
		
		Thread timer = new Thread(){

			public void run() {

				try {

					sleep(4000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally{
					
					Intent openMainActivity= new Intent("com.shivu.myprofile.Menu");
					startActivity(openMainActivity);
				}

			}	

		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		startingMusic.release();
		finish();
	}


}
