package Realization;

public class Coliseum extends Stadium
{
    private  String Name = "Coliseum";
    private int Watchmen;
    private double WhitePower;

    public Coliseum(int Watchman, double WhitePower) {
        this.Watchmen = Watchmen;
        this.WhitePower = WhitePower;
    }

    @Override
    public int getWatchmen() {
        return Watchmen;
    }

    @Override
    public double getWhitePower() {
        return WhitePower;
    }
    @Override
    public String getName(){return Name;}
}

