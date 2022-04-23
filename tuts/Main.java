class Main {

	static int MAX_ITER = 1000000;

	static double func(double x)
	{
		return (x * x * x - x - 11);
	}

	// Prints root of func(x)
	// in interval [a, b]
	static void regulaFalsi(double a, double b)
	{
		if (func(a) * func(b) >= 0)
		{
			System.out.println("You have not assumed right a and b");
		}
		// Initialize result
		double c = a;

		for (int i = 0; i < MAX_ITER; i++)
		{
			// Find the point that touches x axis
			c = (a * func(b) - b * func(a))
				/ (func(b) - func(a));

			// Check if the above found point is root
			if (func(c) == 0)
				break;

			// Decide the side to repeat the steps
			else if (func(c) * func(a) < 0)
				b = c;
			else
				a = c;
		}
		System.out.println("The value of root is : " + Math.round(c * 1000.0) / 1000.0);
	}

	// Driver program
	public static void main(String[] args)
	{
		// Initial values assumed
		double a = 2, b = 3;
		regulaFalsi(a, b);
	}
}