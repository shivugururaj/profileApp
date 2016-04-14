package com.shivu.myprofile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Certificates extends ListActivity {
	
	String classes[]={"CognizantAmbassador","SpringFestAmbassador","CivilDefenceMember","CivilDefenceVolunteer","NationalConference",
			"AndroidWorkShop","TcsTechBytes2010","TcsTechBytes2011","UtsahaVolunteer","MicrosoftDreamSpark"
			,"ScienceTalent2004","ScienceTalent2005"};

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//full screen
	/*	requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		*/
		//----
		
	setListAdapter(new ArrayAdapter<String>(Certificates.this, android.R.layout.simple_list_item_1 , classes));
	
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		super.onListItemClick(l, v, position, id);
		String posClicked= classes[position];
		try{
		Class ourClass= Class.forName("com.shivu.myprofile."+ posClicked);
		Intent ourIntent = new Intent(Certificates.this,ourClass);
		startActivity(ourIntent);
		}
		catch(ClassNotFoundException e)
		{ e.printStackTrace();}
		
		
	}


}
