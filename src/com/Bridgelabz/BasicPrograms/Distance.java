package com.Bridgelabz.BasicPrograms;

import java.util.*;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float distance;
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println(x + " " + y);

		distance = (float) Math.sqrt(x * x + y * y);
		System.out.println("Distance of line from (" + x + "," + y
				+ ") to origin (0,0) is " + distance);
	}

}
