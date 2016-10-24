package homeTask3;

import java.util.Scanner;

public class taskThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, l;
		System.out.print("Enter radius: ");
		r = input.nextDouble();
		l = 2 * r * Math.PI;
		System.out.println("Square is: " + l);
		input.close();
	}

}
