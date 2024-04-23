/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grocerystore;

/**
 *
 * @author Hamooda
 */
class Grocery extends Product {
    private String expirationDate;
    private String category;

    public Grocery(String groceryName, double groceryPrice, int groceryQuantity, String expirationDate1, String category1) {
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate + ", Category: " + category;
    }
}
