import static java.lang.System.*;


class car{
  public static void main(String[] args) {

    Thread obj = new Thread(()->{
        out.print("Fueling\n");
        try{
          int i=0;
          while(i<=100){
            Thread.sleep(100);
          out.print("\r"+(i++)+"%");
        }
        out.print("\n Car Steady and running\n");
        while(i>=0){
          Thread.sleep(10);
          i--;
          out.print("-");
        }
      }
        catch(Exception e){
          out.print(e.getMessage());
        }
      });
      obj.start();
  }
}
