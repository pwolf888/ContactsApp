package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    String[] strings = {"James","Bill","Dave","Suzan","Kane"};

    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);


        final Button button = (Button) findViewById(R.id.contactsButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setContentView(R.layout.contactslistpage);
            }
        });


    }
}
