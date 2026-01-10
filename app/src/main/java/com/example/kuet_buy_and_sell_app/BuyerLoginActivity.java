package com.example.kuet_buy_and_sell_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.widget.TextView;


public class BuyerLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_login);

        TextView tvSignup = findViewById(R.id.tvGoToBuyerSignup);
        tvSignup.setOnClickListener(v -> {

            Intent intent = new Intent(BuyerLoginActivity.this, BuyerSignupActivity.class);
            startActivity(intent);
        });
    }
}