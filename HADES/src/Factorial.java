import java.util.*;
public class Factorial {
    public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input number:  ");
		int n = console.nextInt();     
		System.out.println(facto(n));
	}
    
    public static int facto(int n) {
        if(n == 0 || n == 1) {
    		  return 1;
    	}else {
    		return n * facto(n-1);
    	}
    }
}
