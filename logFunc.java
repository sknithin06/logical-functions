package bridgelabz;
import java.util.Scanner;
public class logFunc {
	static void calculateRoots(int a, int b, int c ) {
	int d =(b * b) - (4 * a * c);
	if (d > 0) {
		double x = (Math.sqrt(d));
		double root1 = (b + x) / (2 * a);
		double root2 = (b - x) / (2 * a);
		System.out.println("The roots of the equation are real and different");
		System.out.println("The values of Roots is:"+root1);
		System.out.println("The values of roots is:"+root2);
	}
	else if (d == 0) {
		double root1 = b / (2 * a);
		double root2 = b  / (2 * a);
		System.out.println("The roots of the equation are real and  equal");
		System.out.println("The values of Roots is:"+root1);
		System.out.println("The values of roots is:"+root2);
	}
	else {
		double real = -b / (2 * a);
		double imaginary = Math.sqrt(-d )/ (2 * a);
		System.out.format("root1 = %.2f+%.2fi",real,imaginary);
		System.out.format("root2 = %.2f-%.2fi",real,imaginary);
	}	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Logical Function Program ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");  
		int a = sc.nextInt();  
		System.out.print("Enter second number:");  
		int b = sc.nextInt();  
		System.out.print("Enter third number:");  
		int c = sc.nextInt();
		calculateRoots(a, b, c);
	}
}
