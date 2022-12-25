package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int factor = 2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find prime factor ");
		num = scan.nextInt();
		while (num > 1) {
			if (num % factor == 0) {
				System.out.println(factor);
				num = num / factor;
			} else
				factor++;

		}
	}

}
