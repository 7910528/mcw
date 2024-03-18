package com.mcw;

import java.util.ArrayList;

public class Order
{
    private OrderState state;
    private ArrayList<OrderObserver> observers;
    public Order()
    {
        state = new InProcessingState();
        observers = new ArrayList<>();
    }
    public void setState(OrderState state)
    {
        this.state = state;
    }
    public void updateState()
    {
        state.updateState(this);
        notifyObservers();
    }
    public void attachObserver(OrderObserver observer)
    {
        observers.add(observer);
    }
    public void notifyObservers()
    {
        for (OrderObserver observer : observers)
        {
            observer.update();
        }
    }
}