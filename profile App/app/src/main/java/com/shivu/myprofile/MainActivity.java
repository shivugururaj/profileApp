package com.shivu.myprofile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

   
    
    int counter;
	Button add;
	Button sub;
	TextView display;
    
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        counter=0;
    	add= (Button)findViewById(R.id.bAdd);
    	sub=(Button)findViewById(R.id.bSub);
    	display=(TextView)findViewById(R.id.tvDisplay);
    	
    	
    	add.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    			counter++;
    			display.setText("your total is" + counter);
    		}
    	});
    	
    	
    	sub.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    			counter--;
    			display.setText("your total is" + counter);
    		}
    	});
    
    
    
    
    }


 
   
    
    }
    

