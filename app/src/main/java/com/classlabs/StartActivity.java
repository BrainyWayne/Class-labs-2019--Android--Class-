package com.classlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btnMainActivity = findViewById(R.id.btnMainActivity);

        //Code 1 of 4

        btnMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open the Main Activity

                //Creating a new instance for the intent to open the main activity
                Intent startMainActivity = new Intent(StartActivity.this, MainActivity.class);

                //Starting the main activity
                startActivity(startMainActivity);

            }
        });


    }
}
