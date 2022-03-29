package com.practice.Java_Assigments.assignment7.assignment1;

public class Gerbil extends Rodent{

	public Gerbil()
	{
		System.out.println("I am a Gerbil");
	}
	@Override
	void eat() {
		System.out.println("Gerbil is eating");
	}

	@Override
	void play() {
		System.out.println("Gerbil is Playing");
	}
}
