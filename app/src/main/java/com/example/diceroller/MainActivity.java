package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Random rn = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.dice);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = rn.nextInt(6)+1;

                if(x == 1){
                    imageView.setImageResource(R.drawable.dice1);
                }
                if(x == 2){
                    imageView.setImageResource(R.drawable.dice2);
                }
                if(x == 3){
                    imageView.setImageResource(R.drawable.dice3);
                }
                if(x == 4){
                    imageView.setImageResource(R.drawable.dice4);
                }
                if(x == 5){
                    imageView.setImageResource(R.drawable.dice5);
                }
                if(x == 6){
                    imageView.setImageResource(R.drawable.dice6);
                }
            }
        });



    }
}