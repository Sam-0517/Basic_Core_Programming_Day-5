//Leap Year
package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		if (999 < year && year <= 9999) {
			if (year % 4 == 0) {
				System.out.println(year + " is a Leap year ");
			} else {
				System.out.println(year + " is not a Leap year");
			}

		} else
			System.out.println("Invalid input ");
	}

}
