package organization;

import organization.Menu;

public class Orders extends Menu
{

    public String customersName;
    private int extrasPrice;
    private int price  = basePrice + extrasPrice;
    private int type;
    private int timeToBeDelivered;
    private int state = 1;
    private String extras;



    public Orders(String customersName, int extrasPrice, int timeToBeDelivered, String extras)
    {
        this.customersName = customersName;
        this.extrasPrice = extrasPrice;
        this.timeToBeDelivered = timeToBeDelivered;
        this.extras = extras;

    }

    public String getCustomersName() {
        return customersName;
    }
    public int getPrice() {
        return basePrice + extrasPrice;
    }
    public int getTimeToBeDelivered() {
        return timeToBeDelivered;
    }
    public String getExtras()
    {
        return extras;
    }
}
