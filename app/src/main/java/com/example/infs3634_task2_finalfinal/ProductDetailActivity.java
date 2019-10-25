package com.example.infs3634_task2_finalfinal;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProductDetailActivity extends AppCompatActivity {

    TextView food_name, food_price, food_description;
    ImageView food_image;
    CollapsingToolbarLayout collapse; //for aesthetics
    FloatingActionButton btnCart; //click to order
    ElegantNumberButton numberButton; //to add/subtract quantity of item to order

    int productId = 1;
    private ProductItem productItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        // Init view
        numberButton = findViewById(R.id.number_button);
        btnCart = findViewById(R.id.btnCart);

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CartItem cartItem = new CartItem();
                cartItem.ProductId = productItem.id;
                cartItem.Price = productItem.price;
                cartItem.ProductName = productItem.name;
                cartItem.Quantity = numberButton.getNumber();

                BurgerKongMenu.cartItems.add(cartItem);
                Toast.makeText(ProductDetailActivity.this, "Added to Shopping Cart.", Toast.LENGTH_SHORT).show();
            }
        });

        food_description = findViewById(R.id.food_description);
        food_name = findViewById(R.id.food_name);
        food_price = findViewById(R.id.food_price);
        food_image = findViewById(R.id.img_food);

        collapse = findViewById(R.id.collapse);
        collapse.setExpandedTitleTextAppearance(R.style.ExpandedAppbar);
        collapse.setCollapsedTitleTextAppearance(R.style.CollapseAppbar);

        if (getIntent() != null)
            productId = getIntent().getExtras().getInt("productId" );
        productItem = BurgerKongMenu.getProductById(productId);
        food_image.setImageResource(productItem.image);
        collapse.setTitle(productItem.name);

        food_price.setText(productItem.price);

        food_name.setText(productItem.name);

        food_description.setText(productItem.description);
    }
}