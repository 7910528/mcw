package com.mcw;

public class PreparingState implements OrderState
{
    @Override
    public void updateState(Order order)
    {
        System.out.println("Order is being prepared.");
        order.setState(new DeliveredState());
    }
}