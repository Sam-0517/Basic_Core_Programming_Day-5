package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
		num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is Even ");
		} else
			System.out.println("Number is Odd ");

	}

}
