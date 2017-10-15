import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LT4 {
    public static void main(String[] args) throws FileNotFoundException {
    	File file = new File("lorem.txt");
    	Scanner console = new Scanner(new File("lorem.txt"));
    	int wordCount = 0;
    	
    	System.out.println("Please enter keyword: ");
    	String keyword = console.next();
    	
    	
    	Scanner s = new Scanner();
    	while(s.hasNext()) {
    		wordCount++;
    		
    	}
    	
    	System.out.println("Keyword " + keyword + " is found " + wordCount + " time(s)");
	}
}
