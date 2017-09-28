package com.project.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by acer on 9/28/2017.
 */

public class DetailActivity extends AppCompatActivity {

    ListView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mlist = (ListView) findViewById(R.id.list);
        Bundle mBundle = getIntent().getExtras();



    }
}
