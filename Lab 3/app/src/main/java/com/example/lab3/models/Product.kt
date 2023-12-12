package com.example.lab3.models

class Product (
    id : Int = 0,
    name : String = "",
    var staffId: Int = 0,
    var price: Float = 0.0f,
    var quantity: Int = 0,
    var description: String = ""
) : StoreEntity(id, name)
