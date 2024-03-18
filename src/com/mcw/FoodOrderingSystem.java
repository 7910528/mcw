package com.mcw;

import java.util.Scanner;

public class FoodOrderingSystem
{
    public static void main(String[] args)
    {
        Product burger = new Dish("Burger", 4);
        Product fries = new Dish("Fries", 2);
        Product coke = new Drink("Coke", 1);
        Cart cart = new Cart();
        cart.addProduct(burger);
        cart.addProduct(fries);
        cart.addProduct(coke);
        cart.removeProduct(coke);
        System.out.println("Cart Contents:");
        cart.displayCart();
        Order order = new Order();
        Client client = new Client("Daniil");
        order.attachObserver(client);
        Waiter waiter = new Waiter(order);
        System.out.println("Choose Delivery Option:");
        System.out.println("1. Self Pickup");
        System.out.println("2. Courier Delivery");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                waiter.setDeliveryStrategy(new SelfPickupStrategy());
                break;
            case 2:
                waiter.setDeliveryStrategy(new CourierDeliveryStrategy());
                break;
            default:
                System.out.println("Invalid choice. Using default delivery strategy: Self Pickup.");
                waiter.setDeliveryStrategy(new SelfPickupStrategy());
                break;
        }
        for (Product product : cart.getProducts())
        {
            waiter.takeOrder(product);
        }
        Kitchen kitchen = new Kitchen();
        kitchen.prepareOrder();
        waiter.deliverOrder();
        scanner.close();
    }
}