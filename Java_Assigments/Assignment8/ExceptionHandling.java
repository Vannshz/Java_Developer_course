package com.practice.Java_Assigments.Assignment8;

import java.util.Locale;

public class ExceptionHandling {
	public static void main(String[] args) {
try
{
	checkName("Vannsh");
}
catch(Exception e)
{
	System.out.println(e);
}

try
{
	checkcity("Dehradun");
}
catch (Exception e)
{
	System.out.println(e);
}
try
{
	checkAge(12);

}
catch (Exception e)
{
	System.out.println(e);
}
finally {
	System.out.println("Passed");
}
	}
	public static void checkName(String s) throws InvalidNameFormat
	{
		if(!(s.equals(s.toLowerCase())))
		{
			throw new InvalidNameFormat("Please write the name is right format");

		}
		else
		{
			System.out.println("Name is in Right Format");
		}
	}

	public static void checkcity(String s) throws InvalidCityName
	{
		if(!(s=="Dehradun"))
		{
			throw new InvalidCityName("Please write the correct city name");

		}
		else
		{
			System.out.println("Correct City name");
		}
	}
	public static void checkAge(int age ) throws AgeException
	{
		if(age <18 )
		{
			throw new AgeException("you are not eligible to watch this web series");
		}
		else
		{
			System.out.println("Go Ahead");
		}
	}

}
