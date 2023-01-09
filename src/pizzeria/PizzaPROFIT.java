package pizzeria;

import organization.Orders;
import java.util.Collections;
public class PizzaPROFIT extends Pizzeria
{
    @Override
    public Orders getOrder()
    {
        identity = "PROFIT";
        Orders ord;
        int maxprice = orders.get(0).getPrice();
        int p, id = 0;

        for (int i = 1; i < orders.size(); i++)
        {
            p = orders.get(i).getPrice();
            if (maxprice < p) {
                maxprice = p;
                id = i;
            }
        }
        ord = orders.remove(id);
        return ord;

    }
}
