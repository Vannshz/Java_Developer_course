package com.practice.Java_developer_course;

import java.util.Scanner;

public class DivisibleByThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Please enter your integer");
		n= sc.nextInt();
		if(n%3==0)
			System.out.println( n + " is divisble by 3");
		else
			System.out.println( n + " is NOT divisble by 3");
	}
}
