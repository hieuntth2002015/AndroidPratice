package com.android.pratice.Dao;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.android.pratice.Entity.Product;


import java.util.List;

@Dao
public interface ProductDao {
    @Insert(onConflict = REPLACE)
    void insertProduct(Product product);

    @Query("SELECT * FROM products")
    List<Product> findAll();


    List<Product> getAll();
}
