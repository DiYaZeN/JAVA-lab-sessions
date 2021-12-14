// Create a class called Employee that includes three pieces of information as instance variables—a first 
// name (type String), a last name (type String) and a monthly salary (type double). Your class should have 
// a constructor that initializes the three instance variables. Provide a set and a get method for each 
// instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named 
// EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display 
// the yearly salary for each Employee. Then give each Employee a 10% raise and display each Employee’s 
// yearly salary again.
import java.text.NumberFormat;
public class EmployeeTest {
 public static void main(String[] args) {
 Employee employee1= new 
Employee("Sam","Smith",10000);
 Employee employee2= new 
Employee("John","Keels",20000);
 System.out.printf("Monthly Salary of %s %s is 
%s 
\n",employee1.getName(),employee1.getLastName(),Numbe
rFormat.getCurrencyInstance().format(employee1.getMon
thlySalary()));
 System.out.printf("Monthly Salary of %s %s is 
%s \n\n", employee2.getName(), 
employee2.getLastName(), 
NumberFormat.getCurrencyInstance().format(employee2.g
etMonthlySalary()));
 
employee1.setMonthlySalary(employee1.getMonthlySalary
()*1.1);
 
employee2.setMonthlySalary(employee2.getMonthlySalary
()*1.1);
 System.out.println("Salary after 10% 
raise\n");
 System.out.printf("Monthly Salary of %s %s is 
%s 
\n",employee1.getName(),employee1.getLastName(),Numbe
rFormat.getCurrencyInstance().format(employee1.getMon
thlySalary()));
 System.out.printf("Monthly Salary of %s %s is 
%s \n
",employee2.getName(),employee2.getLastName(),NumberF
ormat.getCurrencyInstance().format(employee2.getMonth
lySalary()));
 }
}

                    
                    
public class Employee {
 private String name ;
 private String lastName;
 private double monthlySalary;
 public Employee(String name,String 
lastName,double monthlySalary){
 this.lastName=lastName;
 this.name=name;
 if(monthlySalary>=0){
 this.monthlySalary=monthlySalary;
 }
 else{
 this.monthlySalary=0;
 }
 }
 public void setName(String name ){
 this.name=name;
 }
 public String getName(){
 return name;
 }
 public void setLastName(String lastName){
 this.lastName=lastName;
 }
 public String getLastName(){
 return lastName;
 }
  public class Employee {
 private String name ;
 private String lastName;
 private double monthlySalary;
 public Employee(String name,String 
lastName,double monthlySalary){
 this.lastName=lastName;
 this.name=name;
 if(monthlySalary>=0){
 this.monthlySalary=monthlySalary;
 }
 else{
 this.monthlySalary=0;
 }
 }
 public void setName(String name ){
 this.name=name;
 }
 public String getName(){
 return name;
 }
 public void setLastName(String lastName){
 this.lastName=lastName;
 }
 public String getLastName(){
 return lastName;
 }

