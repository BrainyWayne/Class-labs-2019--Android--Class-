package com.classlabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Images extends AppCompatActivity {

    Button btnFifa;
    Button btnCos;

    ImageView imageFifa, imageCos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);


        btnFifa = findViewById(R.id.btnfifa);
        btnCos = findViewById(R.id.btnCos);
        imageCos = findViewById(R.id.imageCOS);
        imageFifa = findViewById(R.id.imageFifa);


        btnFifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*imageFifa.setVisibility(View.VISIBLE);
                imageCos.setVisibility(View.GONE);*/

                //using one image to set for both
                imageCos.setImageResource(R.drawable.fifa);
            }
        });


        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*imageCos.setVisibility(View.VISIBLE);
                imageFifa.setVisibility(View.GONE);*/

                //using one image to set for both
                imageCos.setImageResource(R.drawable.cos);
            }
        });


    }
}
