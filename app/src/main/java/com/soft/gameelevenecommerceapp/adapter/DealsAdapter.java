package com.soft.gameelevenecommerceapp.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.DealsModel;

import java.util.List;

public class DealsAdapter extends RecyclerView.Adapter<DealsAdapter.ViewHolder> {

    List<DealsModel> dealsModels;

    Context context;

    public DealsAdapter(List<DealsModel> dealsModels, Context context) {
        this.dealsModels = dealsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_deals, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.dealsImage.setImageAlpha(dealsModels.get(position).getImage());
     //   holder.dealsBtn.setText(dealsModels.get(position).getShop());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dealsModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView dealsImage;
       // Button dealsBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dealsImage = itemView.findViewById(R.id.deals_image);
       //     dealsBtn = itemView.findViewById(R.id.deals_btn);

        }
    }
}
