

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double num1, num2, num3, num4 = 0;
		System.out.println("Enter first: ");
		num1 = in.nextDouble();
		System.out.println("Enter second: ");
		num2 = in.nextDouble();

		in.nextLine();

		System.out.println("Enter operator: ");

		String operator = in.nextLine();

		if (operator.equals("+")) {
			num3 = num1 + num2;
			System.out.println("Result: " + num3);
		} else if (operator.equals("-")) {
			num4 = num1 - num2;
			System.out.println("Result: " + num4);

		} else if (operator.equals("/")) {
			num3 = num1 / num2;
			System.out.println("Result: " + num3);
		} else if (operator.equals("*")) {
			num4 = num1 * num2;
			System.out.println("Result: " + num4);
		}

		in.close();

	}

}
