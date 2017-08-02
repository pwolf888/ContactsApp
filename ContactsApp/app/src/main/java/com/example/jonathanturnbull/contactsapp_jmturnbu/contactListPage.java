package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class contactListPage extends ListActivity {

    String[] itemname ={
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War",
            "Jeff",
            "Dingo Jones",
            "Captain Crunch",
            "Jora"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_page);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.contactlist,
                R.id.Itemname,itemname));
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
