package com.example.gridview;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.GridView;


@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	
	GridView gv;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setNumColumns(2);
        
        Cursor c=managedQuery(Contacts.People.CONTENT_URI, null, null, null, Contacts.People.NAME);
        String[] cols=new String[]{Contacts.People.NAME};
        int[] view= new int[]{android.R.id.text1};
        SimpleCursorAdapter adapter=new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,c,cols,view);
        gv.setAdapter(adapter);
    }


   
}
