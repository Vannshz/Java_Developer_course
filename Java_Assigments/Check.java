package com.practice.Java_Assigments;

import java.util.Locale;
import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str;
		str=sc.nextLine();
		str=str.toLowerCase();
		boolean find=true;
		for(char c='a';c<='z';c++)
		{
			if(!str.contains(String.valueOf(c)))
			{
				find=false;
				break;
			}
		}

		if(find)
			System.out.println("Contains all the alphabets");
		else
			System.out.println("Does not contains all the alphabets");
		

	}
}
