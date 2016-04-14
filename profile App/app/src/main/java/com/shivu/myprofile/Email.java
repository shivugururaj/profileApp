package com.shivu.myprofile;


import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Email extends Activity implements View.OnClickListener {

	EditText personsEmail, subject, body;
	String emailAdd, subject1, body1;
	Button sendEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}

	private void initializeVars() {
		// TODO Auto-generated method stub
		personsEmail = (EditText) findViewById(R.id.etEmails);
		subject= (EditText) findViewById(R.id.etSubject);
		body = (EditText) findViewById(R.id.etBody);
		
		sendEmail = (Button) findViewById(R.id.bSentEmail);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		boolean didItWork = true;
		
try {
	
	convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
	String emailaddress[] = { emailAdd };

	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
	emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
	emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject1);
	emailIntent.setType("plain/text");
	emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, body1);
	startActivity(emailIntent);
	
} catch (Exception e) {
	// TODO: handle exception
	didItWork=false;
	
}

		
	}

	private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
		// TODO Auto-generated method stub
		emailAdd = personsEmail.getText().toString();
		subject1 = subject.getText().toString();
		body1 = body.getText().toString();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}