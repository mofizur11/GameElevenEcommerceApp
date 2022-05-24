package com.soft.gameelevenecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.soft.gameelevenecommerceapp.fragment.AccountFragment;
import com.soft.gameelevenecommerceapp.fragment.CartFragment;
import com.soft.gameelevenecommerceapp.fragment.CategoryFragment;
import com.soft.gameelevenecommerceapp.fragment.HomeFragment;
import com.soft.gameelevenecommerceapp.fragment.WishListFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        }

        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(view -> getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit());


        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        bottomNavigationView.setSelectedItemId(R.id.anchor);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.buttom_category) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CategoryFragment()).commit();
            } else if (item.getItemId() == R.id.buttom_wishlist) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WishListFragment()).commit();
            } else if (item.getItemId() == R.id.buttom_cart) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CartFragment()).commit();
            } else if (item.getItemId() == R.id.buttom_account) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AccountFragment()).commit();
            }

            return false;
        });
    }


}
