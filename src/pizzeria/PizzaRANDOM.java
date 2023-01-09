package pizzeria;
import organization.Orders;

import java.util.concurrent.ThreadLocalRandom;
public class PizzaRANDOM extends Pizzeria
{
    @Override
    public Orders getOrder()
    {
        identity = "RANDOM";
        Orders ord;
        int random_id = ThreadLocalRandom.current().nextInt(0, orders.size());

        ord = orders.remove(random_id);

        return ord;
    }

}
