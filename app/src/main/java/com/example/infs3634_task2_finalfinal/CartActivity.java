package com.example.infs3634_task2_finalfinal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.text.NumberFormat;
import java.util.Locale;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView tvTotalPrice;
    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.listCart);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        tvTotalPrice = findViewById(R.id.total);
        loadOrderList();
    }

    private void loadOrderList() {
        adapter = new CartAdapter(BurgerKongMenu.cartItems, this);
        adapter.notifyDataSetChanged(); //from Android developer - to notify data set has changed
        recyclerView.setAdapter(adapter);

        int total = 0; //initialize
        for (CartItem order : BurgerKongMenu.cartItems)
            total += (Integer.parseInt(order.Price)) * (Integer.parseInt(order.Quantity)); //calculation of total order
        Locale locale = new Locale("en", "AU");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale); //recommended way to display currency (in reference to locale)
        tvTotalPrice.setText(fmt.format(total));
    }
}