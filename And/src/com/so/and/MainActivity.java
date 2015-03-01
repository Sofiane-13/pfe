package com.so.and;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {
	public static String ism;
	
	
	CheckBox msg,rep,calen,cal;
	static String m,re,cale,ca;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        btn = (Button) findViewById(R.id.but);
        btn.setOnClickListener(this);
        m="0";re="0";cale="0";ca="0";
		cal = (CheckBox) findViewById(R.id.checkBox1);
		calen = (CheckBox) findViewById(R.id.checkBox2);
		msg = (CheckBox) findViewById(R.id.checkBox3);
		rep = (CheckBox) findViewById(R.id.checkBox4);
		addButtonClickListner();
    }
    
    public void addButtonClickListner() {
		Button btnNavigator = (Button)findViewById(R.id.button1);
		btnNavigator.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg) {
				// TODO Auto-generated method stub
				
				EditText et =(EditText)findViewById(R.id.editText1);
				ism = et.getText().toString();
				
				
				
				if(cal.isChecked())ca="1";
				if(calen.isChecked())cale="1";
				if(msg.isChecked())m="1";
				if(rep.isChecked())re="1";
				c.cre();
			}
		});
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
		Bundle passer = new Bundle();
		passer.putString("name", ism);
		Intent  myintent = new Intent(this,Act2.class);
		myintent.putExtras(passer);
		startActivity(myintent);
	}
}
