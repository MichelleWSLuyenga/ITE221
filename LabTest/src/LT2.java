import java.util.*;
public class LT2 {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	System.out.print("Enter number of stars:  ");
    	int printStar = console.nextInt();
    	
    	for(int i = 1; i <= printStar; i++) {
    		for(int j = 1; j <= i; j++) {
    			System.out.print(" ");
    		}
    		System.out.println("*");
    	}
	}
}
