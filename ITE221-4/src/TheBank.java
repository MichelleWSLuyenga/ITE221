import java.util.*;
public class TheBank {
    public static void main(String[] args) {
		Scanner wn = new Scanner(System.in);
		
		System.out.print("Enter money: ");
		int money = wn.nextInt();
		System.out.println("============== The Bank ==============");
		
		int thousand = money / 1000;
		int fiveHundreds = (money - (1000 * thousand)) / 500;
		int oneHundred = (money - (1000 * thousand + 500 * fiveHundreds)) / 100;
		int fifty = (money - (1000 * thousand + 500 * fiveHundreds + 100 * oneHundred)) / 50;
		int twenty = (money - (1000 * thousand + 500 * fiveHundreds + 100 * oneHundred + 50 * fifty)) / 20;
		int ten = (money - (1000 * thousand + 500 * fiveHundreds + 100 * oneHundred + 50 * fifty + 20 * twenty)) / 10;
		int five = (money - (1000 * thousand + 500 * fiveHundreds + 100 * oneHundred + 50 * fifty + 20 * twenty + 10 * ten)) / 5;
		int one = (money - (1000 * thousand + 500 * fiveHundreds + 100 * oneHundred + 50 * fifty + 20 * twenty + 10 * ten + 5 * five)) / 1;
		
		System.out.println("No. of 1000THB banknote: " + thousand);
		System.out.println("No. of 500THB banknote:  " + fiveHundreds);
		System.out.println("No. of 100THB banknote:  " + oneHundred);
		System.out.println("No. of 50THB banknote:  " + fifty);
		System.out.println("No. of 20THB banknote:  " + twenty);
		System.out.println("No. of 10THB coin:   " + ten);
		System.out.println("No. of 5THB coin:  " + five);
		System.out.println("No. of 1THB coin:  " + one);
		System.out.println("======================================");
	}
}
