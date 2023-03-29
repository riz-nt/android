package com.example.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	Button start;
	Button stop;
	Button reset;
	TextView timezone;
	long starttime = 0L;
	long timem=0L;
	long times=0L;
	long timeu=0L;
	private  Handler customHandler=new Handler();
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        start =(Button) findViewById(R.id.button1);
        stop=(Button) findViewById(R.id.button2);
        reset=(Button) findViewById(R.id.button3);
        timezone=(TextView) findViewById(R.id.textView1);
        start .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				starttime=SystemClock.uptimeMillis();
				
				customHandler.postDelayed(updateTimerThread,0);
				
			}
		});
        
        reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				timezone.setText("00:00:00");
				
			}
		});
        stop.setOnClickListener(new View.OnClickListener() {
			
			

			@Override
			public void onClick(View arg0) {
				times+=timem;
				customHandler.removeCallbacks(updateTimerThread);
				
			}
		}); 
    }
    private Runnable updateTimerThread=new Runnable(){
    	public void run(){
    		timem=SystemClock.uptimeMillis()- starttime;
    		timeu=times+timem;
    		int sec=(int)(timeu/1000);
    		int min=sec/60;
    		sec=sec%60;
    		int milliesec=(int) (timeu%1000);
    		timezone.setText(""+min+":"+String.format("%02d", sec)+":"+String.format("%03d", milliesec));
    		customHandler.postDelayed(this, 0);
    				
    		
    	}
   
    };
    
}
 
  