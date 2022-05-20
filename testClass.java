
class car
  {
    private static String enginestandard;
    car(String engine){
      this.enginestandard = engine;
    }
    String getenginestandard(){
      return this.enginestandard;
    }

  }

class drive extends car
  {
    drive(String s)
    {
      super(s);
    }
    public static void main(String[] args){
      // memory allocation
      System.out.print(new drive("bs4").getenginestandard());
    }
  }
