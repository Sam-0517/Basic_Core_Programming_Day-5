package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class ArrayThreeIntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 0, -1, 2, 4, -2 };
		int tripletcount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {

					int triplet = a[i] + a[j] + a[k];
					if (triplet == 0) {
						tripletcount++;
					}
				}
			}
		}
		System.out.println("Number of triplets present is array are "
				+ tripletcount);
	}

}
