package com.mcw;

import java.util.ArrayList;

public class Cart
{
    private ArrayList<Product> products;
    public Cart()
    {
        products = new ArrayList<>();
    }
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void removeProduct(Product product)
    {
        products.remove(product);
    }
    public void displayCart()
    {
        System.out.println("Cart Contents:");
        for (Product product : products)
        {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
    public ArrayList<Product> getProducts()
    {
        return products;
    }
}