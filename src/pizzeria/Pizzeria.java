package pizzeria;

import organization.Orders;

import java.util.ArrayList;

public abstract class Pizzeria
{
    public String identity;
    private int profit;
    public int ordersToBeDelivered;
    public int ordersAwaiting;
    private int deliveredOrders = 0;

    protected ArrayList<Orders> orders = new ArrayList<>();

    public void addOrder(ArrayList<Orders> orders)
    {
        this.orders = new ArrayList<>(orders);

    }

    public Orders getOrder(){
        Orders ord;
        ord = orders.remove(0);
        return  ord;
    }

    public void addPrice (int price)
    {
        profit += price;
    }

    public int getProfit()
    {
        return profit;
    }
    public void addDeliverdOrder()
    {
        deliveredOrders++;
    }
    public int getDeliverdedOrders()
    {
        return deliveredOrders;
    }
}
