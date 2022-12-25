//Flip Coin and print percentage of Heads and Tails
package com.Bridgelabz.BasicPrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		float head = 0;
		float tail = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number you want to toss coin ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (Math.random() < 0.5)
				head++;
			else
				tail++;
		}
		System.out.println("Head count is " + head);
		System.out.println("Tail count is " + tail);
		float Head_per = (head * 100) / num;
		float Tail_per = (tail * 100) / num;
		System.out.println("Percentage of head tossed is " + Head_per + "%");
		System.out.println("Percentage of tail tossed is " + Tail_per + "%");

	}

}
