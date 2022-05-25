
package com.example.hobbify;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button1 = findViewById(R.id.activity1);
        button2 = findViewById(R.id.activity2);
        button3 = findViewById(R.id.activity3);
        button4 = findViewById(R.id.activity4);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Music.class);
                startActivity(intent);


            }


        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Reading.class);
                startActivity(intent);


            }


        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Travel.class);
                startActivity(intent);


            }


        });



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Recipie.class);
                startActivity(intent);

            }
        });
    }
}
