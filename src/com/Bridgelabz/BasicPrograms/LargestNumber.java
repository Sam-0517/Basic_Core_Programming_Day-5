package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three numbers ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is largest number ");

		else if (num2 > num3)
			System.out.println(num2 + " is largest number ");

		else
			System.out.println(num3 + " is largest number ");

	}

}
