import java.util.*;
public class LT3 {
public static void main(String[] args) {
	String name;
	String name1;
	String name2;
	double salary;
	double salary1;
	double salary2;
	
	Scanner console = new Scanner(System.in);
	System.out.print("Enter employee name: ");
	name = console.next();
	System.out.print("Enter employee salary: ");
	salary = console.nextDouble();
	System.out.println("---------------------------------");
	
	System.out.print("Enter employee name: ");
	name1 = console.next();
	System.out.print("Enter employee salary: ");
	salary1 = console.nextDouble();
	System.out.println("---------------------------------");
	System.out.print("Enter employee name: ");
	name2 = console.next();
	System.out.print("Enter employee salary: ");
	salary2 = console.nextDouble();
	System.out.println("---------------------------------");
	
	System.out.println(name + "'s salary is $" + salary);
	System.out.println(name1 + "'s salary is $" + salary1);
	System.out.println(name2 + "'s salary is $" + salary2);
	System.out.println("---------------------------------");
	
	System.out.println("Average salary is $" + (salary+salary1+salary2)/3);
 }
}
