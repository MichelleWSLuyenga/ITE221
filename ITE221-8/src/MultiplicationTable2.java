import java.util.*;
public class MultiplicationTable2 {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
		System.out.print("Please enter first the number: ");
		int number = console.nextInt();
		System.out.print("Please enter second the number: ");
		int nuSe = console.nextInt();
		for(int i = number; i <= nuSe; i++) {
			    for(int j = 1; j <= 12; j++) {
				    System.out.println(i + "x" + j + " : " + i*j);
			    }
		}
		if(number > nuSe) { 
			System.out.println("Cannot create multiplication table.");
		}
	}
}
