import java.util.*;

abstract class Shape{
	abstract void showArea();
}

class rectangle extends Shape{
	private double length;
	private double breadth;
	public rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void showArea(){
		System.out.print("Area of rectangle is "+(length*breadth));
	}
}

/*class square extends shape{
	
}

class circle extends shape{
	
}*/

class outputClass extends rectangle{
	public outputClass(double len,double bred){
		super(len,bred);
	}
	
	public static void main(String[] args){
		System.out.println("Enter Length and Breadth: \n");
		Scanner scr = new Scanner(System.in);
		double length = Double.parseDouble(scr.next());
		double breadth = Double.parseDouble(scr.next());
		new outputClass(length,breadth).showArea();
	}
}