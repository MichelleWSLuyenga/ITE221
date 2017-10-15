import java.util.*;
public class GuessingNumber {
    public static void main(String[] args) {
		//TODO: Random number from 1 to 10
    	int answer = 7; 
		int number;//user number
        Scanner console = new Scanner(System.in);
		do {
			//getting data from the Scanner
			System.out.print("Guessing number between 1-10: ");
			number = console.nextInt();
			
			if(number == answer) {
				System.out.println("Correct Genius!");
			}else if(number >= 1 && number <= 5) {
				System.out.println("Low!");
			}else if(number >= 6 && number <= 10) {
			    System.out.println("High!");	
			}
			
		}while(number != answer);
		
	}
}      