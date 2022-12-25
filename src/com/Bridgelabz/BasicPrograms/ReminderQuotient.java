package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class ReminderQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		float reminder = 0;
		float quotient = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		num1 = scan.nextFloat();
		System.out.println("Enter Number 2 ");
		num2 = scan.nextFloat();

		reminder = num1 % num2;
		quotient = num1 / num2;
		System.out.println("Quotient for given number is " + quotient);
		System.out.println("Reminder for given number is " + reminder);
	}

}
