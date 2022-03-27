package com.practice.Java_developer_course;

import java.util.*;

public class Proj2_2_madLibsClone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String abj,gName,aAdj,occ,nop,nopoc,noh,aaobj,aocc,bName,mName;
		System.out.println("Enter an adjective");
		abj= sc.nextLine();
		System.out.println("Enter a girl's name");
		gName= sc.nextLine();
		System.out.println("Enter another adjective");
		aAdj= sc.nextLine();
		System.out.println("Enter an occupation");
		occ= sc.nextLine();
		System.out.println("Enter the name of place");
		nop= sc.nextLine();
		System.out.println("Enter the name of piece of clothing");
		nopoc= sc.nextLine();
		System.out.println("Enter the name of hobby");
		noh= sc.nextLine();
		System.out.println("Enter another adjective");
		aaobj= sc.nextLine();
		System.out.println("Enter another occupation");
		aocc= sc.nextLine();
		System.out.println("Enter a boy's name");
		bName= sc.nextLine();
		System.out.println("Enter a man's name");
		mName= sc.nextLine();
		System.out.println("There once was a " +abj + " girl named " +gName + " ,who was a " + aAdj + " " + occ + " in the Kingdom of " + nop +"."  );
		System.out.println("She loved to wear " + nopoc + " and to " + noh + ".She wanted to marry the " + aaobj+ " " + aocc+ " named " + bName + " but her father,King" + mName + " forbid her from seeing him.");
	}
}
