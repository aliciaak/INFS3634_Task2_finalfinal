package com.example.infs3634_task2_finalfinal;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amulyakhare.textdrawable.TextDrawable;

import java.util.ArrayList;
import java.util.List;

import java.text.NumberFormat;
import java.util.Locale;


class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //can't make public ?

    public TextView tvCart, tv_price;
    public ImageView img_cart_count;

    public void setCart(TextView tvCart) {
        this.tvCart = tvCart;
    }

    public CartViewHolder(View itemView) {
        super(itemView);
        tvCart = itemView.findViewById(R.id.cart_item_name);
        tv_price = itemView.findViewById(R.id.cart_item_price);
        img_cart_count = itemView.findViewById(R.id.cart_item_count);
    }

    @Override
    public void onClick(View v) {
    }
}

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private List<CartItem> listData = new ArrayList<>();
    private Context context;

    public CartAdapter(List<CartItem> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.cart_layout, parent, false);
        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        TextDrawable drawable = TextDrawable.builder()
                .buildRound("" + listData.get(position).Quantity, Color.BLACK);
        holder.img_cart_count.setImageDrawable(drawable);

        Locale locale = new Locale("us", "US");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        int price = (Integer.parseInt(listData.get(position).Price)) * (Integer.parseInt(listData.get(position).Quantity));
        holder.tv_price.setText(fmt.format(price));
        holder.tvCart.setText(listData.get(position).ProductName);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
