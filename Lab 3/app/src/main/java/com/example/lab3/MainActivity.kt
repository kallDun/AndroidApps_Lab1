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

        val products : Array<Product> = arrayOf(
            Product(0, "Product 1", 5, 100f, 10, "Product 1 Description"),
            Product(1, "Product 2", 0, 150f, 15, "Product 2 Description"),
            Product(2, "Product 3", 5, 320f, 3, "Product 3 Description")
        )
        val staff : Array<Staff> = arrayOf(
            Staff(0, "Staff 1", 1000f, "Staff 1 CV"),
            Staff(1, "Staff 7", 100000f, "Staff 7 CV"),
            Staff(2, "Staff 2", 1500f, "Staff 2 CV"),
            Staff(3, "Staff 3", 3200f, "Staff 3 CV"),
            Staff(4, "Staff 4", 10000f, "Staff 4 CV"),
            Staff(5, "Staff 5", 15000f, "Staff 5 CV"),
            Staff(6, "Staff 6", 32000f, "Staff 6 CV")
        )
        val array : Array<StoreEntity> = products.asSequence().plus(staff).toList().toTypedArray()

        binding.recyclerList.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        binding.recyclerList.adapter = ProductAdapter(array)

    }
}
