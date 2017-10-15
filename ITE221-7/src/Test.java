import java.util.*;
public class Test {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	String phrase;
		do {
			System.out.print("Type your password: ");
			phrase = console.next();
		} while (!phrase.equals("abracadabra"));
	}
}
