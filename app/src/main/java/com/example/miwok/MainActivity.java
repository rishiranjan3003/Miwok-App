package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the view the numbers of category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        // Set a clickListener on view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent numberIntent = new Intent(MainActivity.this,NumbersActivity.class);
                    startActivity(numberIntent);
            }
        });

        // Find the view the family of category
        TextView family = (TextView)findViewById(R.id.family);
        // Set a clickListener on view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the view the colors of category
        TextView colors = (TextView)findViewById(R.id.colors);
        // Set a clickListener on view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // Find the view the phrases of category
        TextView phrases = (TextView)findViewById(R.id.phrases);
        // Set a clickListener on view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}