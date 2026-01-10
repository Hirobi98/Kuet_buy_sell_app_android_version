package com.example.kuet_buy_and_sell_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SellerLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_seller_login);

        TextView tvSignup = findViewById(R.id.tvGoToSellerSignup);
        tvSignup.setOnClickListener(v -> {

            Intent intent = new Intent(SellerLoginActivity.this, SellerSignupActivity.class);
            startActivity(intent);
        });
    }
}