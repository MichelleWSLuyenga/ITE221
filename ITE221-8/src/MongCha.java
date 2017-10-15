import java.util.Arrays;
public class MongCha {
    public static void main(String[] args) {
		double[] gpa = {3.3,2.5,4.0,1.7,2.75};
		double sum = 0;
		
		for(int i = 0; i < gpa.length; i++) {
			sum = sum + gpa[i];
		}
		System.out.println("GPAX: " + sum/gpa.length);
		Arrays.sort(gpa);
		System.out.println("Max GPA: " + gpa[gpa.length - 1]);
	    System.out.println("Min GPA: " + gpa[0] );
	}
}
