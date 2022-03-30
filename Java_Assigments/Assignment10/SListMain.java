package com.practice.Java_Assigments.Assignment10;


public class SListMain {
	public static void main(String[] args) {
		SList11<Integer> list=new SList11<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.show();
		list.remove(2);
		list.show();
		SList11<String> list2=new SList11<>();
		list2.add("Vannsh");
		list2.add("Dhananjay");
		list2.show();
	}
}