package com.example.multiplication;

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
	int ans=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView1);
        txt1=(EditText) findViewById(R.id.editText1);
        btn=(Button) findViewById(R.id.button1);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				StringBuffer temp=new StringBuffer();
				String num=txt1.getText().toString();
				int n=Integer.parseInt(num);
				for(int i=1;i<=10;i++){
					ans=(i*n);
					temp.append(i + "X" +n+ "="+ans+"\n");
					tv.setText(temp);
				}
				
			}
		});
    }


  
}
