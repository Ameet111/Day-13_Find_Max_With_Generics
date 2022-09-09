package com.bridgelabzgenericsday13;

import java.util.Scanner;

public class UC3_UseGenerics <T extends Comparable<T>>  {
	T first;
	T second;
	T third;
	public UC3_UseGenerics(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}
	public T maximum()
	{
		return testMaximum(first, second, third);
	}
	public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
		T max = first;

		if(second.compareTo(max)>0) {
			max = second;
		}
		if(third.compareTo(max)>0)
		{
			max = third;
		}
		return max;
	}

	public static void main(String[] args) {
		
		System.out.println("Maximum is : " + new UC3_UseGenerics(8,7,6).maximum());
		System.out.println("Maximum is : " + new UC3_UseGenerics(8,7,6).maximum());
		System.out.println("Maximum is : " + new UC3_UseGenerics(8,7,6).maximum());
	} 
	
}
	
	


