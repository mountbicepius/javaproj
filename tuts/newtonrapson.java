
class Main {
     
    static final double EPSILON = 0.001;

    static double func(double x)
    {
        return x * x * x - 8*x + 1;
    }
     
    // Derivative of the above function
    // which is 3*x^x - 2*x
    static double derivFunc(double x)
    {
        return 3 * x * x - 8;
    }
     
    // Function to find the root
    static void newtonRaphson(double x)
    {
        double h = func(x) / derivFunc(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = func(x) / derivFunc(x);
            x = x - h;
        }
     
        System.out.print("The value of the"
                + " root is : "
                + Math.round(x * 10000.0) / 10000.0);
    }
     
    // Driver code
    public static void main (String[] args)
    {
         
        // Initial values assumed
        double x0 = 4.0d;
        newtonRaphson(x0);
    }
}