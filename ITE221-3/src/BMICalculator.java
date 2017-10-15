import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
    	double height;
    	double weight;
    	double bmi;
    	
    	//height = 1.75;
    	//weight = 65;
    	
    	Scanner console = new Scanner(System.in);
    	
    	System.out.print("Enter the height (meter): ");
    	height = console.nextDouble();
    	
    	System.out.print("Enter the weight (kg): ");
    	weight = console.nextDouble();
    	
    	bmi = weight / (height * height);
    	
    	System.out.printf("Current BMI: %.4f ", bmi);
    	
    }
}
