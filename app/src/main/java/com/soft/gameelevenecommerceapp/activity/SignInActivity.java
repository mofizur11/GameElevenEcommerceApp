package com.soft.gameelevenecommerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.fragment.AccountFragment;
import com.soft.gameelevenecommerceapp.fragment.HomeFragment;

public class SignInActivity extends AppCompatActivity {

    TextView signup;
    ImageButton drawerHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        drawerHome = findViewById(R.id.drawer_home);
        drawerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        signup = findViewById(R.id.sign_up);

        signup.setOnClickListener(view -> startActivity(new Intent(SignInActivity.this, SignUpActivity.class)));
    }


}

