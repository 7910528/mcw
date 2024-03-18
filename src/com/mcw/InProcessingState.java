package com.mcw;

public class InProcessingState implements OrderState
{
    @Override
    public void updateState(Order order)
    {
        System.out.println("Order is in processing.");
        order.setState(new PreparingState());
    }
}