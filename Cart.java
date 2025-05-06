package com.dyashin.assignment.ecommerce;

import java.util.ArrayList;

public class Cart {

    private static final int initialCapacity = 10;
    private Product[] productArr;
    private int size = 0;

    public Cart() {
        productArr = new Product[initialCapacity];
    }

    public void add(Product product) {
        checkCapacity();
        productArr[size] = product;
        size++;
    }

    private void checkCapacity() {
        if (size == productArr.length) {
            int newCapacity = size * 2;
            Product[] newArr = new Product[newCapacity];
            for (int i = 0; i < productArr.length; i++) {
                newArr[i] = productArr[i];
            }
            productArr = newArr;
        }
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }
        return productArr[index];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(productArr[i]);
        }
    }
}


