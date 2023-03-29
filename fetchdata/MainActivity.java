package com.example.fetchdata;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText txt1;
	Button btn;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.editText1);
        btn=(Button) findViewById(R.id.button1);
        tv=(TextView) findViewById(R.id.textView1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				tv.setText(txt1.getText().toString());
				
				
			}
		});
    }


}