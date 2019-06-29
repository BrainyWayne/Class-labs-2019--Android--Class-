package com.classlabs.SendingInformationViaIntents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.classlabs.R;

import org.w3c.dom.Text;

public class ReceivingInformationFromIntent extends AppCompatActivity {

    //Code 2 of 4 cont'd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving_information_from_intent);

        //Declaring the textView to display the information we will get from the sent intent
        TextView textView = findViewById(R.id.textView);

        //Displaying the information in the textView
        textView.setText(getIntent().getStringExtra("Name"));





    }
}
