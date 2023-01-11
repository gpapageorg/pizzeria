package Simulator;

import organization.Orders;
import pizzeria.Pizzeria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler
{
    public FileHandler()
    {
        try {
            File file = new File("Shops.txt");
            file.createNewFile();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFinalStats(Pizzeria shop)
    {
        try {
            FileWriter myWriter = new FileWriter("Shops.txt", true);
                myWriter.write("########################################################\n");
                myWriter.write("Name: ");
                myWriter.write(shop.identity);
                myWriter.write("\n");
                myWriter.write("Income: ");
                myWriter.write(Integer.toString(shop.getProfit()));
                myWriter.write(" Euro");
                myWriter.write("\n");
                myWriter.write("Total Delivered Orders: ");
                myWriter.write(Integer.toString(shop.getDeliverdedOrders()));
                myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void writeOrders(ArrayList<Orders> ords)
{
    try {
        FileWriter myWriter = new FileWriter("Shops.txt", true);

        for(int i = 0; i < ords.size(); i++)
        {
            myWriter.write("Order Number: " + i);
            myWriter.write("\n");
            myWriter.write("Customers Name: " + ords.get(i).customersName);
            myWriter.write("\n");
            myWriter.write("Extras: " + ords.get(i).getExtras());
            myWriter.write("\n");
            myWriter.write("Price: " + ords.get(i).getPrice() + " Euro");
            myWriter.write("\n\n");

        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}

}


