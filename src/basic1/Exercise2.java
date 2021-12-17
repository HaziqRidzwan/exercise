//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package basic1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Input the first number: ");
			double n1 = scanner.nextInt();
			System.out.print("Input the second number: ");
			double n2 = scanner.nextInt();
			double sum = n1 + n2;
			double minus = n1 - n2;
			double multiply = n1 * n2;
			double subtract = n1 + n2;
			double divide = n1 / n2;
			double rnums = n1 % n2;
			System.out.printf(
					"Sum = %f\nMinus = %f\nMultiply = %f\nSubtract = %f\nDivide = %f\nRemainderOf2Numbers = %f\n ", sum,
					minus, multiply, subtract, divide, rnums);
		}
	}

}
