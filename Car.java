package SoftEngRepo;

public class Car extends Vehicle
{
    public Car(int speed) 
    {
        super(speed);
    }
    public void displaySpeed() 
    {
        System.out.println("The car is moving at " + speed * 0.95 + " m/h.");
    }
}