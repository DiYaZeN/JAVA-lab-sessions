
// Lab02_Task03
// Modify class Account (Fig. 1) to provide a method called debit that withdraws money from an Account. 
// Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be 
// left unchanged and the method should print a message indicating "Debit amount exceeded account 
// balance." Modify class AccountTest (Fig. 2) to test method debit


import java.util.Scanner;
public class AccountTest {
 public static void main(String[] args) {
 Account account1=new Account(50.00);
 Account account2=new Account(-7.53);
 System.out.printf("account1 balance : 
$%.2f\n",account1.getBalance());
 System.out.printf("account2 balance : 
$%.2f\n",account2.getBalance());
 Scanner input = new Scanner(System.in);
 double withdrawalAmount;
 System.out.printf("Enter Withdrawal amount 
for account 1 : ");
 withdrawalAmount=input.nextDouble();
 System.out.printf("\nsubtracting %.2f from 
account1 balance\n",withdrawalAmount);
 account1.debit(withdrawalAmount);
 System.out.printf("account1 balance : 
$%.2f\n",account1.getBalance());
 System.out.printf("account2 balance : 
$%.2f\n",account2.getBalance());
 System.out.printf("Enter Withdrawal amount 
for account 2 : ");
 withdrawalAmount=input.nextDouble();
 System.out.printf("\nsubtracting %.2f from 
account2 balance\n",withdrawalAmount);
 account2.debit(withdrawalAmount);
 System.out.printf("account1 balance : 
$%.2f\n",account1.getBalance());
 System.out.printf("account2 balance : 
$%.2f\n",account2.getBalance());
 }
}





public class Account {
 private double balance;
 public Account(double initialBalance)
 {
 if(initialBalance>0.0){
 balance=initialBalance;
 }
 }
 public void credit (double amount){
 balance=balance+amount;
 }
 public void debit(Double withdrawalAmount){
 if(withdrawalAmount>balance){
 System.out.println("Debit amount exceeded 
account balance." );
 }
 else{
 balance=balance-withdrawalAmount;
 }
 }
 public double getBalance(){
 return balance;
 }
}
