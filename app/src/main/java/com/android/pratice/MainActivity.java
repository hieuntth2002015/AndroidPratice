package com.android.pratice;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.pratice.Database.AppDatabase;
import com.android.pratice.Entity.Product;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getAppDatabase(this);

        //INSERT
        insertProduct();
        //GET DATA
        getAllProduct();

    }

    private void insertProduct() {
    }

    private void getAllProduct() {
        List<Product> productList = db.productDao().getAll();
        for (Product product : productList){
            Log.d("Product",  "id: " + product.getId() +
                    "name: " + product.getName() +
                    "quantity: " + product.getQuantity());
        }
    }
}