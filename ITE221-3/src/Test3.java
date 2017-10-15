
public class Test3 {
    public static void main(String[] args) {
    	int x = 42;
    	int y = 17;
    	int z = 25;
    	
    	System.out.println(y < x && y <= z);
    	System.out.println(x % 2 == y % 2 || x % 2 == z % 2);
    	System.out.println(x <= y + z && x >= y + z);
    	System.out.println(!(x < y && x < z));
    	System.out.println((x + y) % 2 == 0 || !((z - y) % 2 == 0));
    	
    	/*double c = 1.75;
    	double g = 65.749874987698;
    	double dblTotal = c + g;
 
    	System.out.printf("Total: %-10.2f", dblTotal);*/
    	//System.out.printf("Grand Total: %,.2f", dblTotal);
    }
}
