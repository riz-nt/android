package com.example.datetimepicker;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;


public class MainActivity extends Activity implements OnClickListener {
	Button datepick,timepick;
	EditText txtdate,txttime;
	int year,month,day,hour,minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepick=(Button) findViewById(R.id.button1);
        timepick=(Button) findViewById(R.id.button2);
        txtdate=(EditText) findViewById(R.id.editText1);
        txttime=(EditText) findViewById(R.id.editText2);
        datepick.setOnClickListener(this);
        timepick.setOnClickListener(this);
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
		if(v==datepick){
			final Calendar c=Calendar.getInstance();
			year=c.get(Calendar.YEAR);
			month=c.get(Calendar.MONTH);
			day=c.get(Calendar.DAY_OF_MONTH);
			DatePickerDialog datepickerdialog= new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener() {
				
				@Override
				public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
					txtdate.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
					
				}
			}, year, month, day);
			datepickerdialog.show();
		}
		if(v==timepick){
			final Calendar c=Calendar.getInstance();
			hour=c.get(Calendar.HOUR_OF_DAY);
			minute=c.get(Calendar.MINUTE);
			
			TimePickerDialog timepickerdialog=new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener() {
				
				@Override
				public void onTimeSet(TimePicker view, int hourOfDay, int minuteOfDay) {
					txttime.setText(hourOfDay+":"+minuteOfDay);
					
				}
			}, hour, minute, false);
			timepickerdialog.show();
			}
	}
}
