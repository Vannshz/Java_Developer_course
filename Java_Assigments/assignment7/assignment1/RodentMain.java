package com.practice.Java_Assigments.assignment7.assignment1;

public class RodentMain {
	public static void main(String[] args) {
		Rodent arr[]=new Rodent[3];
		arr[0]=new Mouse();
		arr[1]=new Gerbil();
		arr[2]=new Hamster();


		for(int i=0;i<3;i++)
		{
			arr[i].eat();

			arr[i].play();
		}
	}
}
