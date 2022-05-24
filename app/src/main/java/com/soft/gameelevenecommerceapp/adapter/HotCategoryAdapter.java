package com.soft.gameelevenecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.HotCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HotCategoryAdapter extends RecyclerView.Adapter<HotCategoryAdapter.ViewHolder> {

    List<HotCategoryModel> hotCategoryModels;
    Context context;

    public HotCategoryAdapter(List<HotCategoryModel> hotCategoryModels, Context context) {
        this.hotCategoryModels = hotCategoryModels;
        this.context = context;
    }

    @NonNull
    @Override
    public HotCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_categories, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HotCategoryAdapter.ViewHolder holder, int position) {
        holder.hotCategoriesImage.setImageResource(hotCategoryModels.get(position).getImage());
        holder.hotCategoriesModel.setText(hotCategoryModels.get(position).getPrice());

        final int color = getRandomColor();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
            }
        });



    }


    private int getRandomColor(){

        List<Integer> colorCode = new ArrayList<>();
        colorCode.add(R.color.icon_selected);
        colorCode.add(R.color.flash_deal2);
        colorCode.add(R.color.flash_deal3);
        colorCode.add(R.color.flash_deal4);

        int mycolor = colorCode.size();

        return mycolor;

    }

    @Override
    public int getItemCount() {
        return hotCategoryModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView hotCategoriesImage;
        TextView hotCategoriesModel;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            hotCategoriesImage = itemView.findViewById(R.id.hot_categories_image);
            hotCategoriesModel = itemView.findViewById(R.id.hot_categories_model);

        }
    }


}