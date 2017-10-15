
public class RECURSION {
    public static void main(String[] args) {
		printStar(10);
	}
    public static void printStar(int n) {
    	if(n == 1) {
    		System.out.println("*");
    	}else {
    	    System.out.print("*");
    	    printStar(n - 1);
    	}
    }
}
