package com.mkurfeyiz.ecommerce_web.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="Price")
    private String price;
    @Column(name="Gender")
    private String gender;
    @Column(name="Category")
    private String category;
    @Column(name="Brand")
    private String brand;

    public Products(int id, String name, String price, String gender, String category, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gender = gender;
        this.category = category;
        this.brand = brand;
    }

    public Products() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
