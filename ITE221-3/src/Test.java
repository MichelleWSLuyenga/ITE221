import java.util.*;
public class Test {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	
    	System.out.println("Welcome user");
    	System.out.println("Please enter your name: ");
    	
    	String name = null;
    	name = console.nextLine();
    	
    	System.out.println("Welcome " + name);
    	
    	System.out.print("How old are you? ");
    	int age = 0;
        age = console.nextInt();
    	String message = age > 20 ? "Adult" : "Teenager";
    	System.out.println(message);
    }
}
