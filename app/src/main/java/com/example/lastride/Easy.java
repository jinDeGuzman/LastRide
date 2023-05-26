package com.example.lastride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Easy extends AppCompatActivity {

    EditText guessInput;
    String answer = "Apple";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        guessInput = (EditText) findViewById(R.id.EditView);
    }

    public Void

}