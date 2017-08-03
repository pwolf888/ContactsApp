package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Creates the front page of Bubble
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Pushes user to the Contacts list page
    public void ContactsList(View view) {
        Intent intent = new Intent(this, contactListPage.class);
        startActivity(intent);
    }

    // Pushes user to the single contact page
    public void SingleContact(View view) {
        Intent intent = new Intent(this, contactsPage.class);
        startActivity(intent);
    }
}

