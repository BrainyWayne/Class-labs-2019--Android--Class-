package com.classlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.classlabs.SendingInformationViaIntents.ReceivingInformationFromIntent;

public class Sendinginformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendinginformation);

        //Declaring the button
        Button btnSendName = findViewById(R.id.btnSendName);

        //Code 2 of 4

        btnSendName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editTextName);

                //Declaring a variable called message and storing the information we got from the edittext
                //and putting it in the variable message
                String message = editTextName.getText().toString();

                //Creating a new instance of Intent
                Intent intent = new Intent(Sendinginformation.this, ReceivingInformationFromIntent.class);

                //attaching the value of message to the intent
                intent.putExtra("Name", message);

                //Start the activity
                startActivity(intent);
            }
        });

    }
}
