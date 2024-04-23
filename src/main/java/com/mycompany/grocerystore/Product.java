/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grocerystore;

/**
 *
 * @author Hamooda
 */
abstract class Product implements Operation {
   private static int idCounter = 0;
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.id = ++idCounter;
    }

    public Product(String name, double price, int quantity) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }


    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
    
}
