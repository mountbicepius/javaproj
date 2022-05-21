import java.util.*;


abstract class sample{ // superclass
	sample(){
	}
	abstract void showName(String name);
}

/*class testClass extends sample{ //subclass

	String showName(String nam){
		return nam;
	}
}*/

class testClass2 extends sample{

	void showName(String nam){
		System.out.print("Hi, "+nam);
	}
}

class outputClass extends testClass2{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter a value: \n");
		String nam1= scr.next();
		new outputClass().showName(nam1);
	}
}
