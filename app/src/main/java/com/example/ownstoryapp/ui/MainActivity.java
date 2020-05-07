package com.example.ownstoryapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ownstoryapp.R;

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
                startStory(name);
            }
        });
    }
    public void startStory(String name){
        Resources resources = getResources();
        String key = resources.getString(R.string.user_name);
        Intent intent = new Intent(MainActivity.this,StoryActivity.class);
        intent.putExtra(key, name);
        startActivity(intent);
    }
}
