package com.mkurfeyiz.ecommerce_web.dao;

import com.mkurfeyiz.ecommerce_web.model.Products;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductsHibernateDao implements IProductsDao{

    private EntityManager productsManager;

    @Autowired
    public ProductsHibernateDao(EntityManager productsManager){
        this.productsManager = productsManager;
    }

    @Override
    @Transactional
    public List<Products> getAllProducts() {
        String query = "from Products";
        Session productSession = productsManager.unwrap(Session.class);
        return productSession.createQuery(query, Products.class).getResultList();

    }

    @Override
    public void createProduct(Products product) {
        Session productSession = productsManager.unwrap(Session.class);
        productSession.saveOrUpdate(product);

    }

    @Override
    public void updateProduct(Products product) {
        Session productSession = productsManager.unwrap(Session.class);
        productSession.saveOrUpdate(product);
    }

    @Override
    public void deleteProduct(Products product) {
        Session productSession = productsManager.unwrap(Session.class);
        Products selectedProduct = productSession.get(Products.class, product.getId());
        productSession.delete(selectedProduct);
    }

    @Override
    public Products getProductById(int id) {
        Session productSession = productsManager.unwrap(Session.class);
        return productSession.get(Products.class, id);
    }

}
