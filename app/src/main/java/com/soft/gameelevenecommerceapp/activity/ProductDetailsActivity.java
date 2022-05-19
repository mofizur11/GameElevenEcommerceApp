package com.soft.gameelevenecommerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.ProductAdapter;
import com.soft.gameelevenecommerceapp.util.Data;

public class ProductDetailsActivity extends AppCompatActivity {


    private ProductAdapter pAdapter;
    private RecyclerView productRV;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        initToolbar();



        productRV = findViewById(R.id.product_rv);

        data = new Data();

        pAdapter = new ProductAdapter(data.getAllProductList(), this);
        RecyclerView.LayoutManager pLayoutManager = new GridLayoutManager(this, 2);
        productRV.setLayoutManager(pLayoutManager);
        productRV.setAdapter(pAdapter);


    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
