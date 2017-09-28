package com.project.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mlist;

    String[] name = {"name1", "name2", "name3", "name4", "name5", "name6", "name7"};
    String[] phonenumber = {"phonenumber1", "phonenumber2", "phonenumber3", "phonenumber4", "phonenumber5", "phonenumber6", "phonenumber7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = (ListView) findViewById(R.id.list);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, name, phonenumber);
        mlist.setAdapter(myAdapter);
        Intent mintent= new Intent (MainActivity.this,DetailActivity.class);
        mintent.putExtra("names",phonenumber);
        startActivity(mintent);

        }

}





