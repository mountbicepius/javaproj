import static java.lang.System.*;

class car
  {
    static int modelno;
    private static String enginestandard;
    private String LicensePlate;

    static void startCar(){
      out.println("Vroom");
    }
  }

class drive
  {
    public static void main(String[] args){
      car.startCar();
      car obj = new car();
      car.modelno = 12;
      out.print(car.modelno);
    }
  }
