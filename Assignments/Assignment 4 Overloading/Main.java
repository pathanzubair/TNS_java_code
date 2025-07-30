package com.Booking;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 String StageEvent;
		 String Customer;
		 int NoOfSeats;
		 int choice;
		 int price;
		 String walletNumber;
		 String cardHolder = null;
		 String cardName;
		 String cvv;
		 
		 
		 Scanner sc =new Scanner(System.in);
		 
		 String line1=sc.nextLine();
		 String line2=sc.nextLine();
		 String parts[] = line1.split(",");
		 
		 StageEvent=parts[0].trim();
		 Customer=parts[1].trim();
		 NoOfSeats=Integer.parseInt(parts[2].trim());
		 choice = Integer.parseInt(line2.trim());	 
		 if(choice==3) {
			 cardHolder=sc.nextLine();
		 }
		 String line3=sc.nextLine();
		 price=Integer.parseInt(line3.trim());
		 
		 Ticket_Booking t1= new Ticket_Booking(StageEvent,Customer,NoOfSeats,price);
		 	 
		 switch(choice) {
		 	
		 	case 1:
		 		t1.GeneralInfo();
		 		t1.Payment();
		 		break;
		 		
		 	case 2:
		 		walletNumber=sc.nextLine();
		 		t1.GeneralInfo();
		 		t1.Payment(walletNumber);
		 		break;
		 
		 	case 3:
		 		cardName=sc.nextLine();
		 		cvv=sc.nextLine();
		 		t1.GeneralInfo();
		 		t1.Payment(cardName, cvv, cardHolder);
		 		break;
		 			
		 	default:
		 		System.out.println("Invalid Payment Option");
		 
		 }
		 	

	}

}
