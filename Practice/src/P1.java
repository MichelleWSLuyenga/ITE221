import java.util.*;
public class P1 {
    public static void main(String[] args) {
		line(13);
		line(7);
		line(35);
		System.out.println();
		box(10, 3);
		box(5, 4);
		box(20, 7);
	}
    public static void line(int count) {
    	for(int i = 1; i <= count; i++) {
    		System.out.print("*");
    	}
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
}
