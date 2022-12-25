package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		float result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find harmonic value ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			result = result + (float) 1 / i;
		}
		System.out.println(num + "th Harmonic number is" + result);
	}

}
