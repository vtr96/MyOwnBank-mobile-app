package com.example.myownbank.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myownbank.R;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(view -> {
            Toast.makeText(
                    MainActivity.this,
                    "Login simulado com sucesso!",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}