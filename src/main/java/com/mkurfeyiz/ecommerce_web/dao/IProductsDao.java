package com.mkurfeyiz.ecommerce_web.dao;

import com.mkurfeyiz.ecommerce_web.model.Products;

import java.util.List;


public interface IProductsDao {
    List<Products> getAllProducts();
    void createProduct(Products product);
    void updateProduct(Products product);
    void deleteProduct(Products product);
    Products getProductById(int id);

}
