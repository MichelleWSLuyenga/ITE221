import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Latte {
    public static void main(String[] args) throws FileNotFoundException {
    		File file = new File("Coke.txt");
    		Scanner console = new Scanner(file);
    		
    		while(console.hasNextLine()) {
    			String line = console.nextLine();
    			String[] words = line.split(" ");
    			System.out.println(words.length);
    		}
    }
}
