package com.example.lastride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class custom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        EditText guess;
        guess =(EditText)findViewById(R.id.EditView);
        String Answer = "hello";
    }
}