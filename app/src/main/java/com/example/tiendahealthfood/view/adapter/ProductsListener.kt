package com.example.tiendahealthfood.view.adapter

import com.example.tiendahealthfood.model.Products

interface ProductsListener {
    fun OnProductsClick(product: Products, position: Int)
}