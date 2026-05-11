package com.vtr96.myownbank.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.vtr96.myownbank.R;

public class AddTransactionActivity extends AppCompatActivity {

    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);

        saveButton = findViewById(R.id.saveTransactionButton);

        saveButton.setOnClickListener(view -> {

            Toast.makeText(
                    AddTransactionActivity.this,
                    "Transação salva com sucesso!",
                    Toast.LENGTH_SHORT
            ).show();

            Intent intent = new Intent(
                    AddTransactionActivity.this,
                    HomeActivity.class
            );

            startActivity(intent);
        });
    }
}