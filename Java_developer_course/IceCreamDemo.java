package com.practice.Java_developer_course;

public class IceCreamDemo {
	public static void main(String[] args) {
		IceCream myIC=new IceCream("Chocolate",10,2);
		IceCream yourIC=new IceCream("ButterSchoch",20,1);

		myIC.addTopping("nuts");
		myIC.addTopping("Cheeries");
		yourIC.addTopping("Jelly");
		printIC(myIC);
		printIC(yourIC);

	}

	public static void printIC(IceCream icecream)
	{
		System.out.println(icecream.getName());
		System.out.println("Cost is " + icecream.getCost());
		System.out.println("Topped with ");
		icecream.printToppings();
		System.out.println();
	}

}
