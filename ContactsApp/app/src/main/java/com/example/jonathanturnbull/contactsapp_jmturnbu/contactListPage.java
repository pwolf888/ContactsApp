package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contactListPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_page);
    }

    public void AddContact(View view) {
        Intent intent = new Intent(this, addContactsPage.class);
        startActivity(intent);
    }

    public void main_activity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
