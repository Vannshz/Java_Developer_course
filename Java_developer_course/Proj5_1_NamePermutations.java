package com.practice.Java_developer_course;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fullName,firstName,lastName;
		int indexSpace;
		ArrayList<String> firstNames=new ArrayList<>();
		ArrayList<String> lastNames=new ArrayList<>();


		final int num_names=5;

		for(int i=0;i<num_names;i++)
		{
			System.out.println("Please enter name " + i + "\t");
			fullName=sc.nextLine();
			indexSpace=fullName.indexOf(" ");
			firstName=fullName.substring(0,indexSpace);
			lastName=fullName.substring(indexSpace+1);

			firstNames.add(firstName);
			lastNames.add(lastName);
		}

		for(int i=0;i< firstNames.size();i++)
		{
			for (int j=0; j< lastNames.size();j++)
			{
				System.out.print(firstNames.get(i) + " ");
				System.out.println(lastNames.get(j));

			}
		}
	}
}
