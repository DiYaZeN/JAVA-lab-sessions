// Lab02_Task01
// Given the following class, called NumberHolder, write some code that creates an instance of the class, 
// initializes its two member variables, and then displays the value of each member variable.
// public class NumberHolder {
// public int anInt;
// public float aFloat;
// }


public class Main {
 public static void main(String[] args) {
 NumberHolder numberHolder1=new NumberHolder();
 numberHolder1.anInt=30;
 numberHolder1.aFloat=34;
 System.out.println(numberHolder1.anInt);
 System.out.println(numberHolder1.aFloat);
 
 }
}
