package com.example.lastride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Medium extends AppCompatActivity {

    EditText guessInput;
    String answer = "xylophone";
    String eAnswer = "";
    String guessInputString;
    Boolean checker = false;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        guessInput = (EditText) findViewById(R.id.EditView);
        TextView empty = (TextView) findViewById(R.id.textView2);
        ImageView one = (ImageView) findViewById(R.id.imageView2);
        ImageView two = (ImageView) findViewById(R.id.imageView3);
        ImageView three = (ImageView) findViewById(R.id.imageView4);
        ImageView four = (ImageView) findViewById(R.id.imageView5);
        ImageView five = (ImageView) findViewById(R.id.imageView7);


        for(int i =0; i < answer.length(); i++)
        {
            eAnswer += "_";
        }
        empty.setText(eAnswer);
        String eAnswerOg = eAnswer;

        Button btn = findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guessInput = (EditText) findViewById(R.id.EditView);
                guessInputString = guessInput.getText().toString();

                checker = true;
                for(int i = 0; i< answer.length(); i++)
                {
                    if(guessInputString.equals(answer.substring(i,i+1)))
                    {
                        eAnswer = eAnswer.substring(0,i)+ guessInputString + eAnswer.substring(i+1);
                        checker = false;
                    }
                }
                if(checker)
                {
                    count++;
                    if(count == 1)
                        one.setVisibility(View.VISIBLE);
                    if(count ==2)
                        two.setVisibility(View.VISIBLE);
                    if(count ==3)
                        three.setVisibility(View.VISIBLE);
                    if(count ==4)
                        four.setVisibility(View.VISIBLE);
                    if(count ==5) {
                        five.setVisibility(View.VISIBLE);
                        startActivity(new Intent(Medium.this, Lose.class));

                    }
                    checker = false;
                }
                empty.setText(eAnswer);
                if(eAnswer.equals(answer))
                {
                    startActivity(new Intent(Medium.this, Winn.class));
                }
            }//end on click
        });
    }
}