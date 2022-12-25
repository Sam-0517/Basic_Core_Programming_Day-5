package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the values for a, b, and c");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.println("Eqaution = " + a + "*x*x +" + b + "*x +" + c);

		int delta = b * b - 4 * a * c;
		float root1 = (float) ((-b + Math.sqrt((delta)) / (2 * a)));
		float root2 = (float) ((-b - Math.sqrt((delta)) / (2 * a)));

		System.out.println("Roots of the Eqaution are Root1 = " + root1
				+ " Root2 = " + root2);

	}

}
