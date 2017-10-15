import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = console.nextInt();
		for(int i = 1; i <= 12; i++) {
		   System.out.println(number + "x" + i + ": " + number*i);	
		}
			
	}
}
