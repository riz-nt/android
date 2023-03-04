package com.example.alertbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public  class MainActivity extends Activity implements OnClickListener {
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }




	@Override
	public void onClick(View arg0) {
	AlertDialog.Builder b1=new AlertDialog.Builder(MainActivity.this);
	b1.setIcon(R.drawable.ic_launcher);
	b1.setTitle("RIZ");
	b1.setMessage("NEE SUPERAADAAA");
	b1.setPositiveButton("OK",new DialogInterface.OnClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "You clicked Ok", Toast.LENGTH_LONG).show();
			
		}
	});
		b1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "You clicked Cancel", Toast.LENGTH_LONG).show();
			}
		});
		AlertDialog d1=b1.create();
		d1.show();
	}
}
