package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.DateFormatSymbols;

public class ViewActivity extends AppCompatActivity {
    // create a list view object
    ListView lvMonth;
    // create a string array to store the months
    String[] months;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove the action bar : make the application operate in full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_view);
        // initialise the list view
        lvMonth = findViewById(R.id.lvMonth);
        // populate the array months
        months = new DateFormatSymbols().getMonths();
        // create an array adapter with the months list
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        // set the adapter to associate with the list
        lvMonth.setAdapter(monthAdapter);
    }
}