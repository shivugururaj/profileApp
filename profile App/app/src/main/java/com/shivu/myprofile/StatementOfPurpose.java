package com.shivu.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatementOfPurpose extends Activity {

	TextView d2;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sop);
        
        d2=(TextView)findViewById(R.id.sopText2);
 }
	
}
