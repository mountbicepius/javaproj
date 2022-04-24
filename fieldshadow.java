/*
* call by value- direct calling the variable/method for the referenced class
* Call by reference - when you call upon a specific task/ method by using the reference of the primary trigger
* pass by reference - Simply recalling the original refernce by creating a new instance/ wrapper notation
*/
import static java.lang.System.*;


class baseClass{
  static int value;
  String value2; //instance variables it identifies the purpose of the class directly
  //type of declaration defines whether this is a class variable / local variable / instance variable
   void valuemethd(String value2){
    out.print(value2);
  }
  void printsomething(baseClass obj){ //call by reference
    obj.valuemethd(this.value2);
  }

}

class newClass{
  public static void main(String[] args) {
    baseClass obj = new baseClass();//heap memory //pass by reference
    //baseClass.value= 32; // stack memory
    obj.value2 = "Dhuur bata\n";
    //baseClass.valuemethd(obj.value2);
    obj.printsomething(obj);
    //out.print(obj.value);
  }
}
