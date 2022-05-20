package com.example.hobbify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipieActivity extends AppCompatActivity {

    private TextView mRecipieName;
    private TextView mRecipieIngredients;
    private TextView mRecipieMethodTitle;
    private TextView mRecipie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipie2);


        mRecipieName = (TextView)findViewById(R.id.text_recipie);
        mRecipieIngredients = (TextView)findViewById(R.id.ingredients);
        mRecipieMethodTitle = (TextView)findViewById(R.id.method);
        mRecipie = (TextView)findViewById(R.id.recipie);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipieName");
        String Ingredients = intent.getExtras().getString("RecipieIngredients");
        String Meth0dTitle = intent.getExtras().getString("RecipieMethodTitle");
        String Recipie = intent.getExtras().getString("Recipie");

        mRecipieName.setText(Title);
        mRecipieIngredients.setText(Ingredients);
        mRecipieMethodTitle.setText(Meth0dTitle);
        mRecipie.setText(Recipie);
    }
}