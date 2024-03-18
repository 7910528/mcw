package com.mcw;

public class DeliveredState implements OrderState
{
    @Override
    public void updateState(Order order) {
        System.out.println("Order has been delivered.");
    }
}