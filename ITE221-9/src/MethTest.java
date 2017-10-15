
public class MethTest {
    public static void main(String[] args) {
		printStar(13, "Tiffany", 'A');
		printStar(7, "Taeyeon", 'C');
		printStar(30, "Yoona", 'D');  
    	box(10, 3);
		box(5, 4);
		box(20, 5);
	}
    
    
    public static void printStar(int num, String girl, char grade) {
    	for(int i = 1; i <= num; i++) {
    	System.out.print("*");
        }
    	System.out.println(" - " + girl + " got " + grade);
    	System.out.println();
    }	
    
    
    public static void box(int width, int height) {
    	line(width);
    	
    	for(int line = 1; line <= height - 2; line++) {
    		System.out.print("*");
          for(int space = 1; space <= width - 2; space++) {
        	 System.out.print(" ");
          }
         System.out.println("*");
    	}
    	line(width);
    }
    
    
    public static void line(int n) {
    	for(int i = 1; i <= n; i++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
}
