package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.adapters.ProductAdapter
import com.example.lab3.databinding.ActivityMainBinding
import com.example.lab3.models.Product
import com.example.lab3.models.Staff
import com.example.lab3.models.StoreEntity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val array : Array<StoreEntity> = arrayOf(
            Product(0, "Product 1", 100f, 10, "Product 1 Description"),
            Product(1, "Product 2", 150f, 15, "Product 2 Description"),
            Product(2, "Product 3", 320f, 3, "Product 3 Description"),
            Staff(3, "Staff 1", 1000f, "Staff 1 CV"),
            Staff(4, "Staff 2", 1500f, "Staff 2 CV"),
            Staff(5, "Staff 3", 3200f, "Staff 3 CV"),
            Staff(6, "Staff 4", 10000f, "Staff 4 CV"),
            Staff(7, "Staff 5", 15000f, "Staff 5 CV"),
            Staff(8, "Staff 6", 32000f, "Staff 6 CV"),
            Staff(9, "Staff 7", 100000f, "Staff 7 CV"),
            Staff(10, "Staff 8", 150000f, "Staff 8 CV"),
            Staff(11, "Staff 9", 320000f, "Staff 9 CV"),
            Staff(12, "Staff 10", 1000000f, "Staff 10 CV"),
            Staff(13, "Staff 11", 1500000f, "Staff 11 CV"),
        )

        binding.recyclerList.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        binding.recyclerList.adapter = ProductAdapter(array)

    }
}