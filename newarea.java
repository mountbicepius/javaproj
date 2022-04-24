import static java.lang.System.*;

class area{
  public static void main(String[] args) {
    out.print("Area as per given radius \n");
    System.out.print(new circle(Integer.parseInt(args[0])).area);
  }
}

class circle{
  private double pi;
  static double area;
  circle(){
    this.pi = Math.PI;
  }
  circle(int rad){
    this.pi = Math.PI;
    this.area = (pi* rad * rad);
  }
}
