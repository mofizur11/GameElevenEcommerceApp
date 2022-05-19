package com.soft.gameelevenecommerceapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.CategoryAdapter;
import com.soft.gameelevenecommerceapp.adapter.ProductAdapter;
import com.soft.gameelevenecommerceapp.adapter.SubCategoryAdapter;
import com.soft.gameelevenecommerceapp.util.Data;

public class CategoryFragment extends Fragment {

    private CategoryAdapter cAdapter;
    private SubCategoryAdapter sAdapter;
    private RecyclerView categoryRV,sCategoryRV;
    Data data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.category_fragment, container, false);

        categoryRV = view.findViewById(R.id.category_rv);
        sCategoryRV = view.findViewById(R.id.sub_category_rv);

        data = new Data();

        cAdapter = new CategoryAdapter(data.getAllCategoriesList(), getContext());
        RecyclerView.LayoutManager cLayoutManager = new LinearLayoutManager(getContext());
        categoryRV.setLayoutManager(cLayoutManager);
        categoryRV.setAdapter(cAdapter);

        sAdapter = new SubCategoryAdapter(data.getAllSubCategoryList(), getContext());
        RecyclerView.LayoutManager sLayoutManager = new LinearLayoutManager(getContext());
        sCategoryRV.setLayoutManager(sLayoutManager);
        sCategoryRV.setAdapter(sAdapter);



        return view;
    }
}

