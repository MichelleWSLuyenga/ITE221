import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
		double age[] = new double[5];
    	String[] friends = new String[7];
    	friends[0] = "Blue";
    	friends[2] = "Mintra";
    	
    	System.out.println("My bestfriend is " + friends[0]);
    	for(int i = 0; i <= 6; i++) {
    		System.out.println(friends[i]);
    	}
    	
    	int[] numbers = new int[10];
    	for(int i = 0; i < numbers.length; i++) {
    		numbers[i] = 2 * i;
    		System.out.println(numbers[i]);
    	}
    	System.out.println(Arrays.toString(numbers));
    	
    	
    	double[] gpa = {3.33, 3.77, 4.00, 3.97, 3.99};
    	//System.out.println(gpa[4]);
    	//Arrays.toString can search solve
    	System.out.println(Arrays.toString(gpa));
	}
}
