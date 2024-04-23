/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grocerystore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hamooda
 */
public class GroceryStore {

     public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Add a new product to the inventory");
            System.out.println("2) Remove a product from the inventory");
            System.out.println("3) Update product details");
            System.out.println("4) Display all products in the inventory");
            System.out.println("5) Show the total number of products, total clothes, and total grocery items in the inventory");
            System.out.println("6) Exit the program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter product type (1: Grocery, 2: Clothing): ");
                    int productType = scanner.nextInt();
                    scanner.nextLine(); 
                switch (productType) {
                    case 1:
                        System.out.println("Enter grocery details (name, price, quantity, expiration date, category): ");
                        String groceryName = scanner.nextLine();
                        double groceryPrice = scanner.nextDouble();
                        int groceryQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        String expirationDate = scanner.nextLine();
                        String category = scanner.nextLine();
                        Grocery grocery = new Grocery(groceryName, groceryPrice, groceryQuantity, expirationDate, category);
                        inventory.add(grocery);
                        System.out.println("Grocery item added successfully.");
                        break;
                    case 2:
                        System.out.println("Enter clothing details (name, price, quantity, size, material): ");
                        String clothingName = scanner.nextLine();
                        double clothingPrice = scanner.nextDouble();
                        int clothingQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        String size = scanner.nextLine();
                        String material = scanner.nextLine();
                        Clothing clothing = new Clothing(clothingName, clothingPrice, clothingQuantity, size, material);
                        inventory.add(clothing);
                        System.out.println("Clothing item added successfully.");
                        break;
                    default:
                        System.out.println("Invalid product type.");
                        break;
                }
                    break;

                case 2:
                    System.out.println("Enter the ID of the product to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = false;
                    for (Product p : inventory) {
                        if (p.getId() == removeId) {
                            inventory.remove(p);
                            removed = true;
                            break;
                        }
                    }
                    if (removed) {
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.println("Updating product details is not available for abstract Product class.");
                    break;
                case 4:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("Products in inventory:");
                        for (Product p : inventory) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    int totalProducts = inventory.size();
                    int totalClothes = 0;
                    int totalGroceryItems = 0;
                    for (Product p : inventory) {
                        if (p instanceof Clothing) {
                            totalClothes++;
                        } else if (p instanceof Grocery) {
                            totalGroceryItems++;
                        }
                    }
                    System.out.println("Total Products: " + totalProducts);
                    System.out.println("Total Clothes: " + totalClothes);
                    System.out.println("Total Grocery Items: " + totalGroceryItems);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
