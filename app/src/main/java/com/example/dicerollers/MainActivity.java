package com.example.dicerollers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img2;
    private Button button;
    private Random randomno = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.dice1);
        img2 = findViewById(R.id.dice2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll_dice1();
                roll_dice2();
            }
        });
    }

    private void roll_dice1() {
        int dicno1 = randomno.nextInt(6) + 1;
        switch (dicno1) {
            case 1:
                img1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                img1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                img1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                img1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                img1.setImageResource(R.drawable.dice6);
                break;

        }

    }

    private void roll_dice2() {
        int dicno1 = randomno.nextInt(6) + 1;
        switch (dicno1) {
            case 1:
                img2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                img2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                img2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                img2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                img2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
