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
import com.soft.gameelevenecommerceapp.model.DailyFeaturesModel;

import java.util.List;

public class DailyFeaturesAdapter extends RecyclerView.Adapter<DailyFeaturesAdapter.ViewHolder> {

    List<DailyFeaturesModel> dailyFeaturesModels;

    Context context;

    public DailyFeaturesAdapter(List<DailyFeaturesModel> dailyFeaturesModels, Context context) {
        this.dailyFeaturesModels = dailyFeaturesModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_features, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.dailyFeaturesImage.setImageResource(dailyFeaturesModels.get(position).getImage());
        holder.dailyFeaturesPrice.setText(dailyFeaturesModels.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dailyFeaturesModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView dailyFeaturesImage;
        TextView dailyFeaturesPrice;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dailyFeaturesImage = itemView.findViewById(R.id.daily_features_image);
            dailyFeaturesPrice = itemView.findViewById(R.id.daily_features_price);

        }
    }
}

