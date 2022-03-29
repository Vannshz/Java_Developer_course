package com.practice.Java_Assigments.assignment7.assignment1;

public class Hamster extends Rodent{
	public Hamster()
	{
		System.out.println("I am a Hamster");
	}
	@Override
	void eat() {
		System.out.println("Hamster is eating");
	}

	@Override
	void play() {
		System.out.println("Hamster is Playing");
	}
}
