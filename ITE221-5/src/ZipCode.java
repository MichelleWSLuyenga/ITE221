import java.util.Scanner;
public class ZipCode {
    public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter Zip Code: ");
	    String zip = console.nextLine();
	    switch(zip.charAt(0)) {
	    case '0': case '1': case '2':
	    	System.out.println(zip + "is in the East Coast.");
	    	break;
	    case '4': case '5': case '6':
	    	System.out.println(zip + "is in the Central Plain Area.");
	    }
	}
}
