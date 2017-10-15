import java.util.*;
public class StamfordConcertBookingSystem {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	
		System.out.println("******* Welcome to Stamford Concert *******");
		System.out.println("*******************************************");
		System.out.print("What's your name?  ");
		String name = console.next();
		int num;
      do {
		Calendar c =Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		if(timeOfDay >= 0 && timeOfDay < 12) {
			System.out.println("Good morning, " + name + ". How can I help you?");
		}else if(timeOfDay >= 12 && timeOfDay < 16) {
			System.out.println("Good afternoon, " + name + ". How can I help you?");
		}else if(timeOfDay >= 16 && timeOfDay < 21) {
			System.out.println("Good evenning, " + name + ". How can I help you?");
		}else if(timeOfDay >= 21 && timeOfDay < 24) {
			System.out.println("Good late night, " + name + ". How can I help you?");
		}
		System.out.println("[1] Seat plan");
		System.out.println("[2] Buy a ticket");
		System.out.println("[3] Pay now");
		System.out.println("[4] Concert Information");
		
		int enter = 0;
		System.out.print("Press 1, 2, 3, 4, or -1 to exit: ");
		num = console.nextInt();
		  if(num == 1) { 
			    System.out.println("[1]  [2]  [3]  [4]  [5]");
			    System.out.println("[6]  [7]  [8]  [9]  [10]");
			    System.out.println("[11] [12] [13] [14] [15]");
			    System.out.println("[16] [17] [18] [19] [20]");
			
		  }else if(num == 2) {
			  System.out.println("****** Buy ******");
			  System.out.print("Enter seat number: ");
			  enter = console.nextInt();
			  if(enter >= 1 && enter <= 20) {
			  System.out.println("Seat #" + enter + " is booked.");
			  }else
				  System.out.println("Sorry the entered seat number is not valid");
		  }else if(num == 3) {
			  double price = 399.99;
			  double price1 = 299.99;
			  double price2 = 199.99;
			  double price3 = 99.99;
			  double total = 0;
			  if(enter == 1 || enter == 2 || enter == 3 || enter == 4 || enter == 5) {  
			  System.out.println("Your have booked seat#" + enter + ":  $" + price);
			  }else if(enter == 6 || enter == 7 || enter == 8 || enter == 9 || enter == 10) {
				System.out.println("Your have booked seat#" + enter + ":  $" + price1);
			  }else if(enter == 11 || enter == 12 || enter == 13 || enter == 14 || enter == 15) {
				System.out.println("Your have booked seat#" + enter + ":  $" + price2);
			  }else if(enter == 16 || enter == 17 || enter == 18 || enter == 19 ||enter == 20) {
				System.out.println("Your have booked seat#" + enter + ":  $" + price3);
			  }
			System.out.println("==================================================");
			System.out.println("TOTAL PRICE:  $" + total);
			System.out.println("==================================================");
		  }else if(num == 4) {
			System.out.println("**************************************************");
			System.out.println("Stamford Concert is organized by STIU All Star");
			System.out.println("The booking system is created by Michelle");
			System.out.println("**************************************************");
		  }else if(num == -1) {
			System.out.println("Thank you! Hope to see you soon.");  
		  }else
			  System.out.println("Please press 1, 2, 3, 4, or -1 to exit only");
      }while(num != -1);  
	}
  
}
