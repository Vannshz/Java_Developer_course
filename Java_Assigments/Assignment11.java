package com.practice.Java_Assigments;


import java.io.*;
		import java.util.HashMap;
		import java.util.Scanner;
//Using TextFile and a Map<Character,Integer>,
// create a program that takes the file name as a command line argument and counts the
// occurrence of all the different characters
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
		Scanner scan=new Scanner(System.in);
		String string=scan.next();
		checkOccurence(string);
	}

}