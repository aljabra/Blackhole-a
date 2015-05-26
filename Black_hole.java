 


/**
 * Keeps track of the created instance variables for the execution of the Calculation class, and runs the necessary algorithms. 
 * 
 * Jay Patel and Rohan Balel 
 */
public class Black_hole
{
    // instance variables - replace the example below with your own
    private double x;
    final private double q;
    final private double k = 9;
    final private double t;
    private double a = 0, v = 0;
    /**
     * Constructor for objects of class Black_hole
     */
    public Black_hole(double constant, double intialDistance, double productCharges)
    {
        x = intialDistance;
        q = productCharges;
        t = constant;
    }
    /**
     * Runs the necessary algorithms and solves for the acceleration, velocity and displacement.
     */
    public void change()
    {
        a = Math.pow(1/x,2);
        v = a*t + v;
        x = x + v*t + 1/2*a*t*t;
    }
    public double getAcceleration()
    {
        return a;
    }
    public double getVelocity()
    {
        return v;
    }
    public double getDisplacement()
    {
        return x;
    }
}
