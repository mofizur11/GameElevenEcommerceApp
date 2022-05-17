package com.soft.gameelevenecommerceapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.CartAdapter;
import com.soft.gameelevenecommerceapp.util.Data;

public class CartFragment extends Fragment {

    RecyclerView recyclerView;
    CartAdapter adapter;
    Data data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cart_fragment,container,false);

        recyclerView = view.findViewById(R.id.cart_recycler);

        data = new Data();

        adapter = new CartAdapter(getContext(), data.getAllCartList());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


        return view;
    }


}
