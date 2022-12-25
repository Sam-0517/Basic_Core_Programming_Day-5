package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet ");
		alphabet = scan.next().charAt(0);
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i'
				|| alphabet == 'o' || alphabet == 'u') {
			System.out.println("Given Alphabet is vovel ");
		} else
			System.out.println("Given Alphabet is Consonant ");

	}

}
