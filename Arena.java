package Realization;

public  class Arena extends Stadium
{
    private static String Name = "Arena";
    private int Watchmen;
    private double WhitePower;

    public Arena(int Watchman, double WhitePower)
    {
        this.Watchmen = Watchmen;
        this.WhitePower = WhitePower;
        this.Name=Name;
    }
@Override
public String getName(){return Name;}
    @Override
    public int getWatchmen()
    {
        return Watchmen;
    }
    @Override
        public double getWhitePower()
    {
        return WhitePower;
    }
}