package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addContactsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts_page);
    }

    public void ContactsList(View view) {
        Intent intent = new Intent(this, contactListPage.class);
        startActivity(intent);
    }
}
