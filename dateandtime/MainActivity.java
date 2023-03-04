package com.example.dateandtime;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	Button btn;
	int year,month,day,hour,min;
	String ayadate,ayatime; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				AlertDialog.Builder b1= new AlertDialog.Builder(MainActivity.this);
				b1.setTitle("System Date");
				b1.setMessage("Current System Date and Time is:"+ayadate);
				
				b1.setPositiveButton("OK",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						Calendar calendar=Calendar.getInstance();
						
						hour=calendar.get(Calendar.HOUR_OF_DAY);
						min=calendar.get(Calendar.MINUTE);
						year=calendar.get(Calendar.YEAR);
						month=calendar.get(Calendar.MONTH);
						day=calendar.get(Calendar.DAY_OF_MONTH);
						ayadate=day+"/"+(month+1)+"/"+year+"\n"+hour+":"+min;;
						
						
					}
				});
				AlertDialog d1=b1.create();
				d1.show();
				
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
}
