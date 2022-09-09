package com.bridgelabzgenericsday13;

import java.util.Scanner;

public class UC1_FindMaxValue {
	
	static Integer  a,b,c;
	public void getInput() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Value: ");
		a = s.nextInt();

		System.out.print("Enter Second Value: ");
		b = s.nextInt();

		System.out.print("Enter Third Value: ");
		c = s.nextInt();

	}
	public Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		UC1_FindMaxValue u = new UC1_FindMaxValue();
		Integer max ;
		u.getInput();
		max = u.testMaximum(a, b, c);
		System.out.println("Maxmum value is : " + max);

	}

}
