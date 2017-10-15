
public class SnackBar {
    public static void main(String[] args) {
    	String Shop = "Michelle";
    	System.out.println("Welcome to " + Shop + " shop!");

    	double Lay = 25.0;
    	double Pep = 11.5;
    	double subt = 25.0 + 11.5;
    	double total = subt * .07 + subt;
    	String vat = " (7% VAT)";
    	String bo = " THB";
    	
    	System.out.println("You have bought:");
    	System.out.println("Lay Potato:  " + Lay + bo);
    	System.out.println("Pepsi:       " + Pep + bo);
    	System.out.println("----------------------------------");
    	System.out.println("Total:       " + total + bo + vat);
    	System.out.println("----------------------------------");
    	System.out.println("----------------------------------");
    		
        double number = Math.random() * 100;
    	double floor = Math.floor(number);
    	int myNumber = (int) floor;
    	System.out.println("Lucky draw number: " + myNumber);
    }
}
