package Simulator;

import generator.Generator;
import globalTimer.GlobalTimer;
import organization.Orders;
import pizzeria.PizzaFIFO;
import pizzeria.PizzaPROFIT;
import pizzeria.PizzaRANDOM;
import pizzeria.Pizzeria;

import java.util.ArrayList;

public class Simulation
{
    private int num;
    public Simulation(int num)
    {
        this.num = num;
        execute();
    }

    private void execute()
    {
        ArrayList<Orders> orders;
        PizzaFIFO fifo = new PizzaFIFO();
        PizzaPROFIT profit = new PizzaPROFIT();
        PizzaRANDOM random = new PizzaRANDOM();

        Generator gen = new Generator();

        GlobalTimer fifoTimer = new GlobalTimer(12, 24);
        GlobalTimer profitTimer = new GlobalTimer(12, 24);
        GlobalTimer randomTimer = new GlobalTimer(12, 24);


        orders =  gen.genCustomers(num);

        fifo.addOrder(orders);
        profit.addOrder(orders);
        random.addOrder(orders);

        simulate(fifo, fifoTimer);
        simulate(profit, profitTimer);
        simulate(random, randomTimer);

        printStatistics(fifo);
        printStatistics(profit);
        printStatistics(random);
    }


    private void simulate(Pizzeria shop, GlobalTimer timer)
    {
        Orders ord;
        for(int i = 0; i <num; i++)
        {
            ord = shop.getOrder();
            if(timer.addTime(2 * ord.getTimeToBeDelivered()) != 0)
            {
                System.out.println("Debug: time boundary reached");
                break;
            }
            else
                shop.addPrice(ord.getPrice());
            shop.addDeliverdOrder();
        }
    }
    private void printStatistics(Pizzeria shop)
    {
        System.out.println(shop.identity + " Income: " + shop.getProfit() + " Euro");
        System.out.println("Total Deliverd Orders: " + shop.getDeliverdedOrders());
        System.out.println();
    }
}
