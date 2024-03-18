package com.mcw;

public class Waiter
{
    private Order order;
    private DeliveryStrategy deliveryStrategy;
    public Waiter(Order order)
    {
        this.order = order;
    }
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy)
    {
        this.deliveryStrategy = deliveryStrategy;
    }
    public void takeOrder(Product product)
    {
        order.updateState();
        System.out.println("Took order for " + product.getName());
    }
    public void deliverOrder()
    {
        if (deliveryStrategy != null)
        {
            if (deliveryStrategy instanceof SelfPickupStrategy)
            {
                System.out.println("Customer picks up the order.");
                order.updateState();
            }
            else
            {
                System.out.println("Order is being delivered.");
                deliveryStrategy.deliver();
                order.updateState();
            }
        }
        else
        {
            System.out.println("Delivery strategy not set.");
        }
    }
}