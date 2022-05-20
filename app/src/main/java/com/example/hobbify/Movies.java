package com.example.hobbify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Movies extends AppCompatActivity {


    private View rootView;
    MaterialButton btnBack = rootView.findViewById(R.id.hobbies1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        TextView movies = (TextView) findViewById(R.id.txt2);
        MaterialButton btnBack = rootView.findViewById(R.id.hobbies1);
    }

    public void btnBack(View view) {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}