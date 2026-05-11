package com.vtr96.myownbank.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.vtr96.myownbank.R;

public class HomeActivity extends AppCompatActivity {

    private Button viewTransactionsButton;
    private Button addTransactionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewTransactionsButton = findViewById(R.id.viewTransactionsButton);
        addTransactionButton = findViewById(R.id.addTransactionButton);

        viewTransactionsButton.setOnClickListener(view -> {
            Intent intent = new Intent(
                    HomeActivity.this,
                    TransactionsActivity.class
            );

            startActivity(intent);
        });

        addTransactionButton.setOnClickListener(view -> {
            Intent intent = new Intent(
                    HomeActivity.this,
                    AddTransactionActivity.class
            );

            startActivity(intent);
        });
    }
}