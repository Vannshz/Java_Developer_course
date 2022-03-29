package com.practice.Java_Assigments;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexProblem {

	public static void checkString(String string)
	{

		String regexPattern="[A-Z].*[.]";
		boolean flag=Pattern.matches(regexPattern, string);
		if(flag)
		{
			System.out.print("String match with regular expression");
		}
		else
		{
			System.out.print("String not match with regular expression");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		checkString(string);
	}
}


