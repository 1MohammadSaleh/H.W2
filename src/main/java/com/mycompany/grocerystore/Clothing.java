/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grocerystore;

/**
 *
 * @author Hamooda
 */
class Clothing extends Product {
     private String size;
    private String material;

    public Clothing() {
    }

    public Clothing(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Material: " + material;
    }
}
