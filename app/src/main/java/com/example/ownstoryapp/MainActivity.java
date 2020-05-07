package com.example.ownstoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.userInput);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userInput.getText().toString();
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
                startStory();
            }
        });
    }
    public void startStory(){
        Intent intent = new Intent(MainActivity.this,StoryActivity.class);
        startActivity(intent);
    }
}
