package com.example.add;

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
	EditText txt2;
	Button btn;
	TextView tview;
	Float a;
	Float b;
	Float sum;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText)findViewById(R.id.editText1);
        txt2=(EditText)findViewById(R.id.editText2);
        btn=(Button) findViewById(R.id.button1);
        tview=(TextView) findViewById(R.id.textView1);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				a=Float.parseFloat(txt1.getText().toString());  
				b=Float.parseFloat(txt2.getText().toString());
				sum=a+b;
				tview.setText(Float.toString(sum)); 
			}
		});
     
        
    }


    
}
