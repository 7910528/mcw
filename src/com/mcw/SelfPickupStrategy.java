package com.mcw;

public class SelfPickupStrategy implements DeliveryStrategy
{
    @Override
    public void deliver()
    {
        System.out.println("Customer picks up the order.");
    }
}