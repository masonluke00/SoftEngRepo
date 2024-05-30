package SoftEngRepo;

public class Motorcycle extends Vehicle 
{
    public Motorcycle(int speed) 
    {
        super(speed);
    }
    public void displaySpeed() 
    {
        System.out.println("The motorcycle is moving at " + speed * 1.25 + " m/h.");
    }
}
