// Lab02_Task02
// Write a very simple but complete class. The class represents a counter that counts 0, 1, 2, 3, 4,....
// • The name of the class should be Counter.
// • It has one private instance variable representing the value of the counter.
// • It has two instance methods: 
// o increment() adds one to the counter value, and
// o getValue() returns the current counter value.
// Write a complete definition for the class, Counter.

public class Main {
 public static void main(String[] args) {
 Counter counter=new Counter();
 counter.increment();
 counter.increment();
 System.out.println(counter.getValue());


public class Counter {
 private int counterValue=0;
 public void increment(){
 counterValue++;
 }
 public int getValue(){
 return counterValue;
 }
}
