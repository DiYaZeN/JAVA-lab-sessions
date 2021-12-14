// Lab02_Task04
// Modify class GradeBook (Fig. 3). Include a second String instance variable that represents the name of 
// the course’s instructor. Provide a set method to change the instructor’s name and a get method to 
// retrieve it. Modify the constructor to specify two parameter one for the course name and one for the 
// instructor’s name. Modify method displayMessage such that it first outputs the welcome message and 
// course name, then outputs "This course is presented by: " followed by the instructor’s name. Modify the 
// test application (Fig. 4) to demonstrate the class’s new capabilities.


public class GradeBookTest {
 public static void main(String[] args) {
 GradeBook gradeBook1=new GradeBook("CS101 
Introduction to Java Programming");
 gradeBook1.displayMessage();
 gradeBook1.setInstructorName("Judy Jones");
 gradeBook1.displayMessage();
 }
}



public class GradeBook{
 private String courseName;
 private String instructorName="Sam Smith";
 public GradeBook(String name, String instructor){
 courseName = name;
 instructorName = instructor;
 }
 public void setCourseName(String name){
 courseName = name;
 }
 public String getCourseName(){
 return courseName;
 }
 public void setInstructorName(String name2){
 instructorName = name2;
 System.out.printf("Changing instructor name 
to %s!\n",instructorName);
 }
 public String getInstructorName(){
 return instructorName;
 }
 public void displayMessage(){
 System.out.printf("Welcome to the grade book 
for\n%s!\n", getCourseName());
 System.out.printf("This course is presented 
by : %s!\n", getInstructorName());
 }
}
