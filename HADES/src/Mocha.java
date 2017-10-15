import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mocha {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Americano.txt");
		Scanner console = new Scanner(new File("Americano.txt"));
	/*	int gpa = console.nextInt();
		String stri = console.next();
		System.out.println(gpa + " " + stri);   */
		int current = console.nextInt();
		int next = 0;
		while(console.hasNext()) {
			next = console.nextInt();
			System.out.println(current + " - " + next + " = " + (current-next));
			current = next;
			//System.out.println(console.nextInt());
		}
		//23 98 45 78 34 12
		//23 - 98 = -75
		//98 - 4 = 94
	}
}
