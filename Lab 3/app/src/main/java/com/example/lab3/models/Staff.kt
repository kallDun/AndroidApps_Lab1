package com.example.lab3.models

class Staff(
    id : Int = 0,
    name : String = "",
    var salary: Float = 0.0f,
    var cv: String = ""
) : StoreEntity(id, name)