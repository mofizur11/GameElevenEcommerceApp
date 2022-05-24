package com.soft.gameelevenecommerceapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.soft.gameelevenecommerceapp.R;

public class SignUpActivity extends AppCompatActivity {

    TextView sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sign_in = findViewById(R.id.sign_in);

        sign_in.setOnClickListener(view -> startActivity(new Intent(SignUpActivity.this, SignInActivity.class)));


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}