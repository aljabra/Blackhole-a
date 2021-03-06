 

import java.util.Scanner;
/**
 * Asks the user for input values and returns the corresponding acceleration, velocity, and displacement.
 * 
 * Jay Patel and Rohan Balel
 */
public class Calculation
{
    public static void main(String s[])
    {
        System.out.println("Welcome to the Blackhole");
        System.out.println("Enter the time constant");
        Scanner a = new Scanner(System.in);
        double constant = a.nextDouble();
        System.out.println("Enter the initial distance");
        double x = a.nextDouble();
        System.out.println("Enter the product of charges in nanoColumbs");
        double q = a.nextDouble();
        System.out.println("Enter how many time constant");
        int n = a.nextInt();
        Black_hole b = new Black_hole(constant,x,q);
        for(int i = 1; i <= n; i++)
        {
            b.change();
            System.out.println("Acceleration after " + i + " time constant is " + b.getAcceleration());
            System.out.println("Velocity after " + i + " time constant is " + b.getVelocity());
            System.out.println("Displacement after " + i + " time constant is " + b.getDisplacement());
        }
    }
}
