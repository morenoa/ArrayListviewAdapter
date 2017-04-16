package net.androidbootcamp.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateUsersList();
    }

    private void populateUsersList() {
        // Construct the data source
        ArrayList<User> arrayOfUsers = User.getUsers();
        // Create the adapter to convert the array to views
        Main2Activity adapter = new Main2Activity(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(adapter);
    }

}
