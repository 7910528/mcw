package com.mcw;

public class CourierDeliveryStrategy implements DeliveryStrategy
{
    @Override
    public void deliver()
    {
        System.out.println("Courier delivers the order.");
    }
}