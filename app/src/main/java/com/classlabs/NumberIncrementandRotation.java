package com.classlabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NumberIncrementandRotation extends AppCompatActivity {

    int number = 0;
    TextView txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_incrementand_rotation);

        //Code 3 of 4

        //Declaring the Views
        Button btnIncrement = findViewById(R.id.btnIncreaseNumber);

        txtNumber = findViewById(R.id.txtNumber);


        txtNumber.setText(String.valueOf(number));


        //Checking the savedInstanceState to see if it is not null

           if(savedInstanceState != null){
               number = savedInstanceState.getInt("number");
               txtNumber.setText(String.valueOf(savedInstanceState.getInt("number")));
           }

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Increasing the number by one
                 number++;

                 //Display the number increased
              txtNumber.setText(String.valueOf(number));


            }
        });

    }

    //Saving the number to the saved instance state so that we can retrieve it when we rotate the phone
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);


        savedInstanceState.putInt("number", number);


    }
}
