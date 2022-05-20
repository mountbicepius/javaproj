// CA3 ques 5
import java.util.*;

class circle{
  private double pi;
  double radius; //Instance variable
  double x;
  double y;
  circle(){ // default constructor
    this.pi= Math.PI;
  }
  circle(double rad, double X, double Y){ // whenever we create a new object for class circle we will supply values of radius , x and y
    pi= Math.PI;
    radius=rad;
    x=X;
    y=Y;
  }
  double areaCircle(){
    return (this.pi * this.radius * this.radius);
  }
  double perimeter(){
    return (2 * this.pi * this.radius);
  }
}

class circleTest{ //jvm creates an object of this class nested under java.lang.Object
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter radius of the circle and X and Y coordinate of the point: \n");
    double rad= sc.nextDouble();
    double x= sc.nextDouble();
    double y= sc.nextDouble();
    circle obj = new circle(rad,x,y);
    if(checkwithin(obj) == true){
      System.out.print("\nPoint is within the circle");
    }
    else{
         System.out.print("\nPoint is outside the circle");
    }
    System.exit(0);
  }
  static boolean checkwithin(circle obj){
    double check = ((obj.x-obj.radius)*(obj.x-obj.radius))+((obj.y-obj.radius)*(obj.y-obj.radius));
    if(check <= obj.areaCircle()){
      return true;
    }
    else{
      return false;
    }
  }
}
