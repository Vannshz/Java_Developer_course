package com.practice.Java_developer_course;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Double> myList=new ArrayList<>();
		 double input;

		System.out.println("Enter 0 or more to input in the list or -1 to exit");
		input=sc.nextDouble();

		while(input>=0)
		{
			myList.add(input);
			System.out.println("Enter 0 or more to input in the list or -1 to exit");
			input=sc.nextDouble();
		}
		for(int i= myList.size()-1;i>=0 ;i--)
			System.out.println(myList.get(i));
	}
}
