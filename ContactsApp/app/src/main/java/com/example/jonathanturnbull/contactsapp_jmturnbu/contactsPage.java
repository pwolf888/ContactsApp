package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;

public class contactsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);
    }

    // Closes the screen and returns to main
    public void main_activity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // A button to set the favourites button colour
    public void SingleContact(View view) {
        view.setBackgroundResource(R.color.AccentPurple);
    }
}
