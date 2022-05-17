package com.soft.gameelevenecommerceapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.ProductAdapter;
import com.soft.gameelevenecommerceapp.adapter.ProductMainAdapter;
import com.soft.gameelevenecommerceapp.util.Data;

public class ProductActivity extends AppCompatActivity {


    private RecyclerView productRV;
    private ProductMainAdapter pAdapter;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        productRV = findViewById(R.id.product_rv);

        data = new Data();

        pAdapter = new ProductMainAdapter(data.getAllProductList(), this);
        RecyclerView.LayoutManager pLayoutManager = new GridLayoutManager(this, 2);
        productRV.setLayoutManager(pLayoutManager);
        productRV.setItemAnimator(new DefaultItemAnimator());
        productRV.setAdapter(pAdapter);
    }
}