package com.shivu.myprofile;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Projects extends ListActivity {
	String classes[]={"Project1","Project2","Project3","Project4","Project5","Project6"};

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	setListAdapter(new ArrayAdapter<String>(Projects.this, android.R.layout.simple_list_item_1 , classes));
	
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		super.onListItemClick(l, v, position, id);
		String posClicked= classes[position];
		try{
		Class ourClass= Class.forName("com.shivu.myprofile."+ posClicked);
		Intent ourIntent = new Intent(Projects.this,ourClass);
		startActivity(ourIntent);
		}
		catch(ClassNotFoundException e)
		{ e.printStackTrace();}
		
		
	}
}
