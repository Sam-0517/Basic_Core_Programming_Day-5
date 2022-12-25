package com.Bridgelabz.BasicPrograms;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double windChill;

		// if(0<=t<=50 && 3<=v<=120){

		windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75)
				* Math.pow(v, 0.16);
		System.out
				.println("National Weather Service defines the wind chill to be: "
						+ windChill);

		// }
	}

}
