package SoftEngRepo;
import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a vehicle to display its speed:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        int choice = scanner.nextInt();
        Vehicle vehicle = null;
        switch (choice) 
        {
            case 1:
                System.out.print("Enter the speed of the car in m/h: ");
                int carSpeed = scanner.nextInt();
                vehicle = new Car(carSpeed);
                break;
            case 2:
                System.out.print("Enter the speed of the motorcycle in m/h: ");
                int motorcycleSpeed = scanner.nextInt();
                vehicle = new Motorcycle(motorcycleSpeed);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        if (vehicle != null) {
            vehicle.displaySpeed();
        }

        scanner.close();
    }
}
