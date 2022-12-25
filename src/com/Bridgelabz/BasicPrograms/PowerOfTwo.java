package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int powerOfTwo = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for finding power of two");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			powerOfTwo = 2 * powerOfTwo;
			System.out.println(i + "th power of two is equal to " + powerOfTwo);
		}

	}

}
