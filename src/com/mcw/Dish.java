package com.mcw;

public class Dish implements Product
{
    private String name;
    private double price;
    public Dish(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public double getPrice()
    {
        return price;
    }
}