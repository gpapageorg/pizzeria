package globalTimer;

public class GlobalTimer
{
    int startTime, stopTime, totalMinutes, remainingTime;
    public GlobalTimer(int startTime, int stopTime)
    {
        this.startTime = startTime;
        this.stopTime = stopTime;
        totalMinutes = (stopTime - startTime) * 60;
        remainingTime = totalMinutes;
    }

    public int addTime(int time)
    {
        if(remainingTime - time >= 0)
            remainingTime -= time;
        else
            return -1;
        return 0;
    }
    public int getRemainingTime()
    {
        return remainingTime;
    }


}
