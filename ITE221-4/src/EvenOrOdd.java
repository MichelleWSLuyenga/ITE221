import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
		Scanner wn = new Scanner(System.in);
		
    	System.out.print("Enter number:  ");
    	int number = wn.nextInt();
    	
    	if(number % 2 == 0) {
    		System.out.println("Even number");
    	} else {
    		System.out.println("Odd number");
    	}
	}
}
