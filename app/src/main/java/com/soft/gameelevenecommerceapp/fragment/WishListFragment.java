package com.soft.gameelevenecommerceapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.adapter.WishListAdapter;
import com.soft.gameelevenecommerceapp.util.Data;


public class WishListFragment extends Fragment {

    ImageButton drawerHome;

    RecyclerView recyclerView;
    WishListAdapter adapter;

    Data data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.wishlist_fragment, container, false);


        recyclerView = view.findViewById(R.id.wishlist_recycler);

        data = new Data();

        adapter = new WishListAdapter(getContext(), data.getAllWishList());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        drawerHome = view.findViewById(R.id.drawer_home);
        drawerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment(), null).commit();
            }
        });
        
        return view;
    }



}

