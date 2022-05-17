package com.soft.gameelevenecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.gameelevenecommerceapp.R;
import com.soft.gameelevenecommerceapp.model.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder> {


    private Context context;
    private List<CartModel> items;


    public CartAdapter(Context context, List<CartModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new MyViewHolder(v) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.cartImage.setImageAlpha(items.get(position).getCartImage());
        holder.cartTitle.setText(items.get(position).getCartTitle());
        holder.cartModel.setText(items.get(position).getCartModel());
        holder.cartPrice.setText(items.get(position).getCartPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView cartImage;
        TextView cartTitle, cartModel, cartPrice, cartCount;
        ImageButton cartCheck, cartPlus, cartMinus;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cartImage = itemView.findViewById(R.id.cart_image);
            cartTitle = itemView.findViewById(R.id.cart_title);
            cartModel = itemView.findViewById(R.id.cart_model);
            cartPrice = itemView.findViewById(R.id.cart_price);
            cartCount = itemView.findViewById(R.id.cart_count);
//            cartCheck = itemView.findViewById(R.id.cart_check);
//            cartPlus = itemView.findViewById(R.id.cart_plus);
//            cartMinus = itemView.findViewById(R.id.cart_minus);
        }
    }
}