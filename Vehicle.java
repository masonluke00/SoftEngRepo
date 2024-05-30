package SoftEngRepo;
public abstract class Vehicle 
{
    protected int speed;
    public Vehicle(int speed) 
    {
        this.speed = speed;
    }
    public abstract void displaySpeed();
}