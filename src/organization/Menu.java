package organization;

import java.util.HashMap;

public class Menu {
    protected static int basePrice = 5;

    private HashMap<Integer, String> menu = new HashMap<>(8){{

        put(0,"Olives");
        put(1,"Onions");
        put(2,"Pineapple");
        put(3,"Chicken");
        put(4,"Hum");
        put(5,"Sausage");
    }};

    public String  getMenuElement(int i)
    {
        if (i < menu.size())
        {
            return menu.get(i);

        }
        else
            return "Error";
    }
    public int getMenuSize()
    {
        return menu.size();
    }
}
