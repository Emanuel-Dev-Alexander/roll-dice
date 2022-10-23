package com.example.rolldice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Roll Dice by: Emanuel", Toast.LENGTH_LONG).show();

        Button rollButton;
        rollButton = findViewById(R.id.Button);

        final ImageView leftDice = findViewById(R.id.leftdice);
        final ImageView rightDice;
        rightDice = findViewById(R.id.rigthdice);


        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        final int[] dadoArray = {
                R.drawable.dado1,
                R.drawable.dado2,
                R.drawable.dado3,
                R.drawable.dado4,
                R.drawable.dado5,
                R.drawable.dado6,

        };
        rollButton.setOnClickListener(view -> {
            Random numberRandom = new Random();
            int number = numberRandom.nextInt(6);
            leftDice.setImageResource(diceArray[number]);
            number = numberRandom.nextInt(6);
            rightDice.setImageResource(dadoArray[number]);

        });

    }
}









