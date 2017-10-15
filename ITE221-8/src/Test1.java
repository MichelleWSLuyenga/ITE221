import java.util.*;
public class Test1 {
    public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = console.next();
		/*if(name.equals("Barney")) {
			System.out.println("I love you, you love me");
			System.out.println("We're a happy family!");
		}*/
	    if(name.startsWith("Prof")) {
	    	System.out.println("When are your office hours?");
	    }else if(name.equalsIgnoreCase("STUART")) {
	    	System.out.println("Let's talk about meta!");;
	    }
	}
}
