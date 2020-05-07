package com.example.ownstoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    TextView pageTextView;
    ImageView pageImageView;
    Button ChoiceButton2;
    Button choiceButton1;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        pageImageView = findViewById(R.id.pageImageView);
        Intent intent = getIntent();
        name = intent.getStringExtra;
    }
}
