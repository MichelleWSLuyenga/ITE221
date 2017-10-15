import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import package1.*;
public class Raisin {
    public static void main(String[] args) throws FileNotFoundException {
		PrintStream write =
				new PrintStream(new File("Espresso.txt"));
		
		write.println("I'M ALWAYS LATE!");
		
		//Grizzly
	}
}
