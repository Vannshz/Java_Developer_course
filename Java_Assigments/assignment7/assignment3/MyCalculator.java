package com.practice.Java_Assigments.assignment7.assignment3;

public class MyCalculator {

	public void Add(double x,double y)
	{
		double result;
		result=x+y;
		printResult(result) ;
	}

	public void Sub(double x,double y)
	{
		double result;
		result=x-y;
		printResult(result);
	}

	public void Mul(double x,double y)
	{
		double result;
		result=x*y;
		printResult(result);
	}
	public void Div(double x,double y)
	{
		double result;
		result=x/y;
		printResult(result);
	}
	public void Mod(double x,double y)
	{
		double result;
		result=x%y;
		printResult(result);
	}

	public void printResult(double result) {
		System.out.println("Result is: " + result);
	}

	public static void main(String[] args) {
		MyCalculator obj=new MyCalculator();
		obj.Add(2,3);
		obj.Sub(3,2);
		obj.Mul(33,1);
		obj.Div(3,3);
		obj.Mod(1,1);

	}
}
