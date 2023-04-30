package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean following = false;
    private Button followButton;
    private Button messageButton;

    private TextView messageBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageBox = findViewById(R.id.message_box);
        followButton = findViewById(R.id.follow_button);
        messageButton = findViewById(R.id.message_button);

        followButton.setOnClickListener(view -> {
            if (following) {
                followButton.setText("Unfollow");
            } else {
                followButton.setText("Follow");
            }
            following = !following;
        });

        messageButton.setOnClickListener(view -> {
            messageBox.setText("Message is sent!");

            Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
            startActivity(intent);
        });
    }
}