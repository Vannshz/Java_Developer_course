package com.practice.Java_developer_course;

import java.util.Scanner;

public class Proj_3_1_LearningPackages {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int packageNumber,howManyCourses,baseCost,costPerCourse,numIncluded,totalCost;
		System.out.println("Which of the packages do you want to choose 1,2 or 3");
		packageNumber=sc.nextInt();
		System.out.println("How many courses did you enroll in this month");
		howManyCourses=sc.nextInt();
		if(packageNumber==1)
		{
          baseCost=10;
		  costPerCourse=6;
		  numIncluded=2;
		}
		else if(packageNumber==2)
		{
			baseCost=12;
			costPerCourse=4;
			numIncluded=4;
		}
		else
		{
			baseCost=15;
			costPerCourse=3;
			numIncluded=6;
		}
       if(howManyCourses>numIncluded)
       {
		  totalCost= baseCost +(howManyCourses-numIncluded)*costPerCourse;
       }
	   else
		   totalCost=baseCost;
	}
}
