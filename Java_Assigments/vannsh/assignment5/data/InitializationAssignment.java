package com.practice.Java_Assigments.vannsh.assignment5.data;

public class InitializationAssignment {
	int var11;
	char var21;

	public void method1()
	{
		System.out.println(var11);
		System.out.println(var21);

	}
	public void method2()
	{
		int var12;
		char var22;
	//	System.out.println(var12);
	//	System.out.println(var22);
	//   error showing that variable are not initialized
	}

	public static void main(String[] args) {
		InitializationAssignment ob=new InitializationAssignment();
		ob.method1();
		ob.method2();
	}
}
