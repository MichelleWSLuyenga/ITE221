import java.util.*;
public class Number {
   public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	System.out.print("Enter number 1: ");
	int number1 = console.nextInt();
	
	System.out.print("Enter number 2: ");
	int number2 = console.nextInt();
	System.out.println("------------------------------");
	
	System.out.println("Your first number is " + number1);
	System.out.println("Your second number is " + number2);
	System.out.println("------------------------------");
	
	System.out.println("Sum is  " + (number1 + number2));
	System.out.println("Average is  " + ((number1 + number2)/2.0));
	System.out.println("------------------------------");
	
	if(number1 > number2) {
		System.out.println("Number 1 is more than Number 2");
	} else if(number2 > number1) {
		System.out.println("Number 2 is more than Number 1");
	} else {
		System.out.println("Number 1 is equal to Number 2");
	}
	
	
	
   }
}
