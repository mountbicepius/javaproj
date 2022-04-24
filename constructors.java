/*
Constructors always operate on call by reference
*/
import static java.lang.System.*;

class parent{
  int val1;
  char val2;
  parent(){ //initializing instance variables
    this.val1=10; // jonmer shomay gethe jaaye je kno desh er bashinda
    this.val2='0';
  }
}

class child{
  public static void main(String[] args) {
    parent obj = new parent();// instantiate aami lagiye bachha dilam oh holo german
    out.print(obj.val1);//call ei ta bachha tar jonmo goto odhikaar
    //use of constructor to initilizae an object with it's instance variables.
  }
}
