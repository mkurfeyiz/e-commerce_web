package com.mkurfeyiz.ecommerce_web.service;

import com.mkurfeyiz.ecommerce_web.dao.IProductsDao;
import com.mkurfeyiz.ecommerce_web.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsService implements IProductsService{

    private IProductsDao productsDao;

    @Autowired
    public ProductsService(IProductsDao productsDao) {
        this.productsDao = productsDao;
    }

    @Override
    @Transactional
    public List<Products> getAllProducts() {
        return this.productsDao.getAllProducts();
    }

    @Override
    @Transactional
    public void createProduct(Products product) {
        this.productsDao.createProduct(product);
    }

    @Override
    @Transactional
    public void updateProduct(Products product) {
        this.productsDao.updateProduct(product);
    }

    @Override
    @Transactional
    public void deleteProduct(Products product) {
        this.productsDao.deleteProduct(product);
    }

    @Override
    public Products getProductById(int id) {
        return this.productsDao.getProductById(id);
    }
}
