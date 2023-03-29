package com.example.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {
	CheckBox chk1,chk2,chk3;
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1=(CheckBox) findViewById(R.id.checkBox1);   
        chk2=(CheckBox) findViewById(R.id.checkBox2);
        chk3=(CheckBox) findViewById(R.id.checkBox3);
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(this); 
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
	public void onClick(View arg0) {
		StringBuffer strb=new StringBuffer();
		strb.append("Android:").append(chk1.isChecked());
		strb.append("\nWindows:").append(chk2.isChecked());
		strb.append("\nMac:").append(chk3.isChecked());
		
		Toast.makeText(MainActivity.this, strb.toString(),Toast.LENGTH_LONG).show();
	}
}
