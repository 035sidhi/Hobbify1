package com.example.hobbify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private View rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hobbies = (TextView) findViewById(R.id.signin);
        MaterialButton hobbies2 = rootView.findViewById(R.id.hobbies2);
        MaterialButton hobbies3 = rootView.findViewById(R.id.hobbies3);
        MaterialButton hobbies4 = rootView.findViewById(R.id.hobbies4);
        MaterialButton hobbies5 = rootView.findViewById(R.id.hobbies5);

    }

    public void btnNext(View view) {

        MaterialButton btnNext = rootView.findViewById(R.id.hobbies1);
        Intent intent= new Intent(this,Movies.class);
        startActivity(intent);
    }
}