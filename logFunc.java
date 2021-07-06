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
	static void distance(double x1, double x2 , double y1, double y2) {
		double p = 2;
		double y = Math.pow((x2 - x1),p) + Math.pow((y2- y1),p);
		System.out.println(Math.sqrt(y));
		System.out.println("The distance between the 2 points is :"+y);			
	}
	static void findTriplets(int[] array, int n) {
		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j < n-2; j++) {
				for (int k = j + 1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i]);
						System.out.print(" ");
						System.out.print(array[j]);
						System.out.print(" "); 
						System.out.print(array[k]);
						System.out.print(" \n ");
					}
				}
			}
		}
	}
	static void windMills(double v, double t ) {
		if ( t <= 50) {
			if ( v >= 3 || v <= 120) {	
				double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
				System.out.println("Given a temperature of "+t);  
		        System.out.println("Given a speed of: "+v);  
				System.out.println("The wind chill is "+windChill);
			}
		}
		else {
			System.out.println("invalid input");
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
		
		System.out.print("Enter first number- ");  
		double x1=sc.nextDouble();  
		System.out.print("Enter second number- ");  
		double x2=sc.nextDouble();  
		System.out.print("Enter third number- ");  
		double y1= sc.nextDouble();  
		System.out.print("enter fourth number-");
		double y2= sc.nextDouble();
		distance(x1, x2, y1, y2);
		
		int array[] = {0, -1, 2, -3, 1};
		int n = array.length;
		findTriplets(array, n);
		
		System.out.print("Enter the temperature in Fahrenheit :");
		double t = sc.nextDouble();
		System.out.print("Enter the wind speed in miles per hour:");
		double v = sc.nextDouble();
		windMills(v, t);
	}
}
