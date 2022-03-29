package com.practice.Java_Assigments.assignment7.assignment2;

public class CycleMain {
	public static void main(String[] args) {
		Cycle arr[]=new Cycle[3];
		arr[0]=new Bicycle();
		arr[1]=new Unicycle();
		arr[2]=new Tricycle();

		//upcasting
		arr[0].Balance();
		arr[1].Balance();
		arr[2].Balance();

		//Downcasting

		((Bicycle)arr[0]).Balance();
		((Unicycle)arr[1]).Balance();
		((Tricycle)arr[2]).Balance();

	}
}
