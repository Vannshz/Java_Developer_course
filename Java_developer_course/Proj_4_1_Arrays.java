package com.practice.Java_developer_course;

import java.util.Scanner;

public class Proj_4_1_Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] values=new int[5];
		for(int i=0;i< values.length;i++)
		{
			System.out.println("Enter the value");
			values[i]= sc.nextInt();
		}
		for(int i=0;i< values.length;i++)
		{
			System.out.println("Result is " + values[i]*2);
		}
	}
}
