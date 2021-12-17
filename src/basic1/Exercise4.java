//Write a Java program to print the area and perimeter of a circle.

package basic1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input radius: ");
		double r = input.nextInt();

		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * r * r;

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

	}

}
