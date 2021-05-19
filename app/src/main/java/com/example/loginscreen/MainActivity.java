package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // create a variable for the login button
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove the action bar : make the application operate in full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        // initialise the button
        button = (Button) findViewById(R.id.button);
        // listen when the button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a method to open the List view page
                openViewActivity();
            }
        });
    }
    public void openViewActivity(){
        // create an intent to open the activity
        Intent intent = new Intent(this, ViewActivity.class);
        // open the intent i.e open the activity
        startActivity(intent);
    }
}