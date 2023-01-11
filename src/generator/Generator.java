package generator;


import organization.Menu;
import organization.Orders;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Generator extends Menu {
    String[] names = {"Stephanos Maniatas", "Iason Karahaliatos", "Apollon Galanilis",
            "Mathaios Paulakis", "Zaharias Staneas", "Argiris Moraitallis", "Isidoros Apostoliadis", "Panagiotakis Palaiotzis",
            "Paris Thanelis", "Spyro Vasilelis", "Paraskevi Miskatou", "Fani Lazouli", "Iro Chondroti", "Koralia Panou"};
    private final ArrayList<Orders> orders = new ArrayList<>();


    private int randomNameId = ThreadLocalRandom.current().nextInt(0, names.length);
    private int numberOfExtras = ThreadLocalRandom.current().nextInt(1, 8);
    private int ETA = ThreadLocalRandom.current().nextInt(0, 3);


    public ArrayList<Orders> genCustomers(int number)
    {
        for (int i = 0; i < number; i++)
        {
            Orders ord = new Orders(names[randomNameId], numberOfExtras * 2, calculateETA(), genExtras());
            orders.add(ord);

            randomNameId = ThreadLocalRandom.current().nextInt(0, names.length);
            numberOfExtras = ThreadLocalRandom.current().nextInt(1, 8);
            ETA = ThreadLocalRandom.current().nextInt(0, 3);


        }

        return orders;
    }

    private String genExtras()
    {
        String extras = "";

        for (int i = 0; i < numberOfExtras; i++)
        {
            String elem = getMenuElement(ThreadLocalRandom.current().nextInt(0, getMenuSize()));
            extras +=(elem);

            if(i != numberOfExtras - 1)
                extras+=(", ");

        }
        return extras;
    }

    private int calculateETA()
    {

        if(ETA == 0)
            return 5;

        else if(ETA == 1)
            return 10;

        else if(ETA == 2)
            return 15;

        else return 0;

    }

}