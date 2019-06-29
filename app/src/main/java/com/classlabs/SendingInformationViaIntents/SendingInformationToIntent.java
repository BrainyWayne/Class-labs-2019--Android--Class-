package com.classlabs.SendingInformationViaIntents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.classlabs.R;

public class SendingInformationToIntent extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_information_to_intent);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReceivingInformationFromIntent.class);

                String message = editText.getText().toString();

                intent.putExtra("francis1649617", message);

                startActivity(intent);
            }
        });
    }
}
