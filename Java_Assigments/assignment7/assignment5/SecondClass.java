package com.practice.Java_Assigments.assignment7.assignment5;
public class SecondClass extends FirstClass{
	static class Inner2 extends FirstClass.Inner1
	{

		Inner2() {
			super("Hi");
		}
	}

	public static void main(String[] args) {
		SecondClass.Inner2 inner2=new SecondClass.Inner2();
	}

}