package com.example.jonathanturnbull.contactsapp_jmturnbu;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

/*http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/
        Author:R.K.Kanojia (Android App Developer)
        -->*/
public class contactListPage extends ListActivity {

    String[] itemname ={
            "James",
            "Dave",
            "Lin",
            "Suzan",
            "Clarese",
            "James",
            "Dave",
            "Lin",
            "Suzan",
            "Clarese"

    };

    Integer[] imagename ={
            R.drawable.james,
            R.drawable.dave,
            R.drawable.lin,
            R.drawable.suzan,
            R.drawable.clarese

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list_page);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.contactlist,
                R.id.Itemname,itemname));

    }


/* Ends here */

    public void AddContact(View view) {
        Intent intent = new Intent(this, addContactsPage.class);
        startActivity(intent);
    }

    public void main_activity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void SingleContact(View view) {
        Intent intent = new Intent(this, contactsPage.class);
        startActivity(intent);
    }
}
