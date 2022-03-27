package com.practice.Java_developer_course;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
        ArrayList<Integer> someList=new ArrayList<>();
		someList.add(10);
		someList.add(10);
		someList.add(10);
		someList.add(10);
		someList.add(10);
		someList.add(10);
		someList.add(10);
		someList.add(10);
		int s=0;
		s=sumOfElements(someList);
		System.out.println("Sum is "+ s);
	}

	public static int sumOfElements(ArrayList<Integer> list)
	{
		int sum=0;
		for(int i=0;i< list.size();i++)
		{
			sum+= list.get(i);

		}
		return sum;
	}
}
