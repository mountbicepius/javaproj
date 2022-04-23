// Java program to Demonstrates Shadowing in Java

// Class 1 and 2
// Outer Class
class Shadowing { //avijit number ta nilo

	// Custom instance variable or member variable
	String name = "Scarlett johansson";

	// Nested inner class
	class innerShadowing { // Avijit number ta print korlo jaat Anirudh dekhte paare

		// Instance variable or member variable
		String name = "+91 8618823721";

		// Method of this class to
		// print content of instance variable
		public void print()
		{

			// Print statements
			System.out.println(name);
			System.out.println(Shadowing.this.name);
		}
	}
}

// Class 3
// Main class
class primary {

	// Main driver method
	public static void main(String[] args)
	{

		// Accessing an inner class by
		// creating object of outer class inside main()
		Shadowing obj = new Shadowing(); //primary class e Shadowing er lok ke (citizenship) instantiate dilam

		Shadowing.innerShadowing innerObj
			= obj.new innerShadowing(); //avijit ke citizenship dichhi

		// Calling method defined inside inner class
		// inside main() method
		innerObj.print(); // phone number chechie bole
	}
}
