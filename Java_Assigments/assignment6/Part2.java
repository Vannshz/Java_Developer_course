package com.practice.Java_Assigments.assignment6;

public class Part2 {
	public Part2()
	{
		this(2);
		System.out.println("I am in constructor 1");
	}
	public Part2(int x)
	{

		System.out.println("I am in constructor " + x);
	}

	public static void main(String[] args) {
		Part2 ob=new Part2();
	}
}
