
public class NewYearProgram {
    public static void main(String[] args) {
		int today = 13;
		int newYear = 31;
		System.out.println("Counting down to new year!");
		for(int i = (newYear - today); i >= 1; i--) {
			if(i > 1) {
				System.out.println(i + " days left.");
			} else if (i == 1){
				System.out.println(i + " day left.");
			}
		}  
		System.out.println("Happy New Year!");     
	}
}
