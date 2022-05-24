package com.soft.gameelevenecommerceapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.fragment.HomeFragment;

public class SignUpActivity extends AppCompatActivity {

    TextView sign_in;
    ImageButton drawerHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        drawerHome = findViewById(R.id.drawer_home);
        drawerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

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