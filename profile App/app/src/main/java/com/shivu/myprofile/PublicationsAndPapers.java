package com.shivu.myprofile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PublicationsAndPapers extends ListActivity {
	String classes[]={"IJER","IJECSCSE","IJSRD","RATE2013"};

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//full screen
	/*	requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		*/
		//----
		
	setListAdapter(new ArrayAdapter<String>(PublicationsAndPapers.this, android.R.layout.simple_list_item_1 , classes));
	
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		super.onListItemClick(l, v, position, id);
		String posClicked= classes[position];
		try{
		Class ourClass= Class.forName("com.shivu.myprofile."+ posClicked);
		Intent ourIntent = new Intent(PublicationsAndPapers.this,ourClass);
		startActivity(ourIntent);
		}
		catch(ClassNotFoundException e)
		{ e.printStackTrace();}
		
		
	}

	
	
	
	
}
