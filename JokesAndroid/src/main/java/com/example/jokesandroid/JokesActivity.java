package com.example.jokesandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView jokeTV = findViewById(R.id.JokeTextview);

if(getIntent()!=null) {
    String jokefromIntent = getIntent().getStringExtra("joke");
    jokeTV.setText(jokefromIntent);
}
    }
}
