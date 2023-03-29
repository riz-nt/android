package com.example.itemlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
	ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.listView1);
        String title[]={"Google","Facebook","Twitter","Instagram"};
        ArrayAdapter<String> adt=new ArrayAdapter<String> (MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,title);
        lv.setAdapter(adt);
    }
}


   
    
