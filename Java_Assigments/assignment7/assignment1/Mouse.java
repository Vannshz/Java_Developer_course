package com.practice.Java_Assigments.assignment7.assignment1;

public class Mouse extends Rodent {

	public Mouse()
	{
		System.out.println("I am a Mouse");
	}
	@Override
	void eat() {
		System.out.println("Mouse is eating");
	}

	@Override
	void play() {
		System.out.println("Mouse is playing");
	}


}
