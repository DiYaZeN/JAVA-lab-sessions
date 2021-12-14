
// Write an application that computes the total ticket sales of a concert. There are three types of seatings: 
// A, B, and C. the program accepts the number of tickets sold and the price of a ticket for each of the 
// three types of seats. The total sales are computed as 
// totalSales = numberOfA_Seats * pricePerA_Seat +
// numberOfB_Seats * pricePerB_Seat +
// numberOfC_Seats * pricePerC_Seat ;
// Write this application using an instantiable SeatType class. An instance of the SeatType class keeps track 
// of the ticket price for a given type of seat (A, B, or C) and the number of tickets sold for each seat type. 
// (Hint: Create objects called seatA, seatB, and seatC to track the sales).



public class TicketSalesTest {
 public static void main(String[] args) {
 TicketSales seatA=new TicketSales(20,10);
 TicketSales seatB=new TicketSales(30,5);
 TicketSales seatC=new TicketSales(40,2);
 int totalSales= 
seatA.getTotalSales()+seatB.getTotalSales()+seatC.get
TotalSales();
 System.out.printf("Total Sales of selling 
Tickets is %d \n",totalSales);
 System.out.printf("\nChanging Sales and seat 
prices");
 seatA.setTotalSales(20,20);
 seatB.setTotalSales(30,10);
 seatC.setTotalSales(40,5);
 totalSales= 
seatA.getTotalSales()+seatB.getTotalSales()+seatC.get
TotalSales();
 System.out.printf("\n\nNew Total Prices is 
%d",totalSales);
 }
      }




public class TicketSales {
 private int totalSales;
 private int seatPrice;
 private int sales;
 public TicketSales(int sales,int seatPrice){
 this.seatPrice=seatPrice;
 this.sales=sales;
 totalSales=sales*seatPrice;
 }
 public void setTotalSales(int sales,int 
seatPrice){
 this.sales=sales;
 this.seatPrice=seatPrice;
 totalSales=this.sales*this.seatPrice;
 }
 public int getTotalSales(){
 return totalSales;
 }
}
