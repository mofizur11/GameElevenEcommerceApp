package com.soft.gameelevenecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.BrandModel;

import java.util.List;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.ViewHolder> {

    List<BrandModel> brandModels;
    Context context;

    public BrandAdapter(List<BrandModel> brandModels, Context context) {
        this.brandModels = brandModels;
        this.context = context;
    }

    @NonNull
    @Override
    public BrandAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandAdapter.ViewHolder holder, int position) {
        holder.brandImage.setImageResource(brandModels.get(position).getImage());
        holder.brandCImage.setImageResource(brandModels.get(position).getcImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return brandModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView brandImage;
        ImageView brandCImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            brandImage = itemView.findViewById(R.id.brand_image);
            brandCImage = itemView.findViewById(R.id.cImage);

        }
    }


}
