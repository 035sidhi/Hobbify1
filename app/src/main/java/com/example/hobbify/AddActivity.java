package com.example.hobbify;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddActivity extends AppCompatActivity {

    EditText title_input, review_input, state_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        title_input = findViewById(R.id.title_input);
        review_input = findViewById(R.id.review_input);
        state_input = findViewById(R.id.state_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(title_input.getText().toString().trim(),
                        review_input.getText().toString().trim(),
                        state_input.getText().toString().trim());
                Map<String, Object> city = new HashMap<>();
                city.put("book", title_input.getText().toString().trim());
                city.put("state", review_input.getText().toString().trim());
                city.put("review",state_input.getText().toString().trim());
                city.put("price", "19.99");
                city.put("title", 1);
                db.collection("sidhi").add(city).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(AddActivity.this, "Uploaded", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }

    public void btnBack(View view) {
    }
}