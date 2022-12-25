package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 and number 2 ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Numbers before swapping are num1 = " + num1
				+ " num2 = " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping are num1 = " + num1
				+ " num2 = " + num2);
	}

}
