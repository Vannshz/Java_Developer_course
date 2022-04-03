package com.practice.Java_Assigments;


import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment11 {
	public static void checkOccurence(String filename)
	{
		try {

			FileReader fileReader=new FileReader(filename);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();

			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < line.length(); i++) {
				if (map.containsKey(line.charAt(i))) {
					int v = map.get(line.charAt(i));
					v = v + 1;
					map.put(line.charAt(i), v);
				} else {
					map.put(line.charAt(i), 1);
				}
			}
			for (Character ch : map.keySet()) {

				System.out.println("Character: " + ch);
				System.out.println("no. of occurences: " + map.get(ch));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		HashMap map=new HashMap();
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		checkOccurence(string);
	}

}