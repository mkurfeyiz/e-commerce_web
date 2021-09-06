package com.mkurfeyiz.ecommerce_web.controller;

import com.mkurfeyiz.ecommerce_web.model.Products;
import com.mkurfeyiz.ecommerce_web.service.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private IProductsService productsService;

    @Autowired
    public ProductController(IProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/getProducts")
    public List<Products> getAllProducts(){
        return this.productsService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Products> createProduct(@RequestBody Products product){

        if (!ObjectUtils.isEmpty(product)) {
            productsService.createProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/updateProduct")
    public ResponseEntity<Products> updateProduct(@RequestBody Products product){
        if (!ObjectUtils.isEmpty(product)) {
            productsService.updateProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/deleteProduct")
    public ResponseEntity<Products> deleteProduct(@RequestBody Products product){
        if (!ObjectUtils.isEmpty(product)) {
            productsService.deleteProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable int id){
        return this.productsService.getProductById(id);
    }

}