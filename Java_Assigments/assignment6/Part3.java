package com.practice.Java_Assigments.assignment6;

public class Part3 {

	public Part3(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		Part3 part3Array[]=new Part3[5];

		part3Array[0]=new Part3("Vannsh");
		part3Array[1]=new Part3("Shikhar");
		part3Array[2]=new Part3("Dhanajay");
		part3Array[2]=new Part3("Bhanu");


		for(int i=0;i < part3Array.length;i++)
		{
			System.out.println(part3Array[i]);
		}


	}
}

//    Output
//Vannsh
//Shikhar
//Dhanajay
//Bhanu
//com.practice.Java_Assigments.assignment6.Part3@7a79be86
//com.practice.Java_Assigments.assignment6.Part3@34ce8af7
//com.practice.Java_Assigments.assignment6.Part3@b684286
//null
//null