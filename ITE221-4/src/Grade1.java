import java.util.*;
public class Grade1 {
    public static void main(String[] args) {
Scanner wn = new Scanner(System.in);
		
		System.out.print("Enter score:  ");
		double score = wn.nextDouble();
		
		if(score > 100) {
			System.out.println("Out of Range");
		} else if(score >= 80) {
			System.out.println("You have got A");
		} else if(score >= 70) {
			System.out.println("You have got B");
		} else if(score >= 60) {
			System.out.println("You have got C");
		} else if(score >= 0) {
			System.out.println("You have got F");
		} else if (score < 0) {
			System.out.println("Out of range");
		}
	}
}
