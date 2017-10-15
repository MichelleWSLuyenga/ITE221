import java.util.*;
public class Grade {
    public static void main(String[] args) {
		Scanner wn = new Scanner(System.in);
		
		System.out.print("Enter score:  ");
		double score = wn.nextDouble();
		
		if(score >= 80 && score <= 100) {
			System.out.println("You have got A");
		} else if(score >= 70 && score <= 79) {
			System.out.println("You have got B");
		} else if(score >= 60 && score <= 69) {
			System.out.println("You have got C");
		} else if(score >= 50 && score <= 59) {
			System.out.println("You have got D");
		} else if(score <= 49 && score >= 0) {
			System.out.println("You have got F");
		} else {
			System.out.println("Out of range");
		}
	}
}
