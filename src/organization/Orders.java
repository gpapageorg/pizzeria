package organization;

import organization.Menu;

public class Orders extends Menu
{

    public String customersName;
    final int basePrice = 5;
    private int extrasPrice;
    private int price  = basePrice + extrasPrice;
    private int type;
    private int timeToBeDelivered;
    private int state = 1;
    private int radiousTime;
//    private static int ARadiousTime = 5;
//    private static int BRadiousTime = 10;
//    private static int CRadiousTime = 15;

    public Orders(String customersName, int extrasPrice, int timeToBeDelivered)
    {
        this.customersName = customersName;
        this.extrasPrice = extrasPrice;
        this.timeToBeDelivered = timeToBeDelivered;
        this.radiousTime = radiousTime;

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
    public int getRadiousTime(){
        return radiousTime;
    }

    public void setRadiousTime(int radiousTime)
    {
        this.radiousTime = radiousTime;
    }
}
