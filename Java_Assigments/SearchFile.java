package com.practice.Java_Assigments;

import java.io.File;
import java.util.Scanner;



// demo class is created
public class SearchFile{

	private void findFile()
	{

		// address of folder or files which is to be searched
		File file = new File("C:/Users/Asus/Desktop/Zemoso");
		//string to store the name of the file
		String str ;
		//  Scanner is declare
		Scanner sc = new Scanner(System.in);
		// while is used to run the program again and again
		while(true){
			int a=0;
			System.out.println("Enter the name of file or folder");
			//take input of file you want to search
			str =sc.nextLine();
			//list of file is stored in string
			String[] files = file.list();
			//continous check each file or folder
			for (String string : files){
				//check the name of file present or not and store in boolean str1
				Boolean str1 = str.equals(string);
				// str1 is true i.e. file is present then print the following
				if (str1){
					a = 1;
					System.out.println("File Found : ");
					System.out.println(string);
					//print the address of the file
					System.out.println("Path : "+ file.getAbsolutePath());
				}
			}
			//if file not found
			if(a == 0)
			{
				System.out.println("File not find : Reenter the name of the file.");
			}
		}
	}

	//declared main()
	public static void main(String[] args){
		//object of Demo class is created
		SearchFile obj =new SearchFile();
		//calling the findFile()
		obj.findFile();
	}
}