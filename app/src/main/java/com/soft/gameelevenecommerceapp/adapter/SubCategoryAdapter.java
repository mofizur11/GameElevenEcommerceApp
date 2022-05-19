package com.soft.gameelevenecommerceapp.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.CategoryModel;
import com.soft.gameelevenecommerceapp.model.SubCategoryModel;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.ViewHolder> {

    List<SubCategoryModel> subCategoryModels;
    Context context;

    public SubCategoryAdapter(List<SubCategoryModel> subCategoryModels, Context context) {
        this.subCategoryModels = subCategoryModels;
        this.context = context;
    }

    @NonNull
    @Override
    public SubCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sub_category, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(subCategoryModels.get(position).getTitle());
        holder.image1.setImageResource(subCategoryModels.get(position).getImage1());
        holder.image2.setImageResource(subCategoryModels.get(position).getImage2());
        holder.image3.setImageResource(subCategoryModels.get(position).getImage3());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        holder.arrow.setOnClickListener(new View.OnClickListener() {

            boolean isChecked = true ;

            @Override
            public void onClick(View view) {
                if (!isChecked) {
                    holder.arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    holder.ly.setVisibility(View.GONE);
                } else {
                    holder.arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    holder.ly.setVisibility(View.VISIBLE);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return subCategoryModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView title;
        LinearLayout ly;
        ImageView arrow, image1, image2, image3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ly = itemView.findViewById(R.id.my_ly);
            title = itemView.findViewById(R.id.title);
            arrow = itemView.findViewById(R.id.arrow);
            image1 = itemView.findViewById(R.id.image1);
            image2 = itemView.findViewById(R.id.image2);
            image3 = itemView.findViewById(R.id.image3);

        }
    }
}





