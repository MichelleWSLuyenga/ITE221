import java.util.*;
public class Recursion {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
		System.out.print("Number of stars: ");
		int n = console.nextInt();
	}
    public static void printStars(int n) {
	    if(n == 1) {
	    	System.out.println("*");
	    }else if(n == 2) {
	    	System.out.print("*");
	    	printStars(1);
	    }else if(n == 3) {
	    	System.out.print("*");
	    	printStars(2);
	    }else if(n == 4) {
	    	System.out.print("*");
	    	printStars(3);
	    }
	}
}
