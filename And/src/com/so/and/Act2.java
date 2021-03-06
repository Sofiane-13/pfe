package com.so.and;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Act2 extends Activity implements OnClickListener {
	String gotism;
	List<Map<String, String>> planetsList = new ArrayList<Map<String,String>>();
	
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.act2);
        btn = (Button) findViewById(R.id.le2);
        btn.setOnClickListener(this);
       Bundle gotpasser = getIntent().getExtras();        
       gotism = gotpasser.getString("name");



        
      
		initList();

	    // We get the ListView component from the layout
	    ListView lv = (ListView) findViewById(R.id.listView);

	    // This is a simple adapter that accepts as parameter
	    // Context
	    // Data list
	    // The row layout that is used during the row creation
	    // The keys used to retrieve the data
	    // The View id used to show the data. The key number and the view id must match
	    SimpleAdapter simpleAdpt = new SimpleAdapter(this, planetsList, android.R.layout.simple_list_item_1, new String[] {"planet"}, new int[] {android.R.id.text1});

	    lv.setAdapter(simpleAdpt);
		
        
    }

    
    
    private void initList() {
	    // We populate the planets
	 	 
		 
    	
	  	planetsList.add(createPlanet("planet", gotism));
	 	}
	  	 
	  	private HashMap<String, String> createPlanet(String key, String name) {
	  	    HashMap<String, String> planet = new HashMap<String, String>();
	  	    planet.put(key, name);
	 	 
	  	    return planet;
	  	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent  myintent = new Intent(v.getContext(),MainActivity.class);
		startActivity(myintent);
	}
	
}
