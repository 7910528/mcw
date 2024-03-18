package com.mcw;

public class Client implements OrderObserver
{
    private String name;
    public Client(String name)
    {
        this.name = name;
    }
    @Override
    public void update()
    {
        System.out.println(name + ", your order has been updated.");
    }
}