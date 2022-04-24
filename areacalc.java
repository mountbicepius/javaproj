import java.lang.*;
import java.util.*;
import static java.lang.System.*;

class area{
  public static void main(String[] args) {
    out.print("Enter a radius :\n");
    Scanner in = new Scanner(System.in);
    int radius = in.nextInt();
    double pi = Math.PI; // pi round upto all decimal place - 3.14159265
    double area = pi * radius * radius; //typecasting already done
    out.print("\n "+ area);
    /*
     Using the primitive type wrapper class to parse (fetch/obtain) one datatype
     from another...
    */
  }
}
