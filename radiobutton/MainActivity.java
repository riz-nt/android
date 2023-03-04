package com.example.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button btn;
	RadioGroup rdg;
	RadioButton rdb;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn=(Button) findViewById(R.id.button1);
        rdg=(RadioGroup) findViewById(R.id.radioGroup1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			int selectid=rdg.getCheckedRadioButtonId()	;
			rdb=(RadioButton)findViewById(selectid);
			Toast.makeText(MainActivity.this,rdb.getText() , Toast.LENGTH_SHORT).show();
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
