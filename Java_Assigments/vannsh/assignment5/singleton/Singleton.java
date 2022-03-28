package com.practice.Java_Assigments.vannsh.assignment5.singleton;

public class Singleton {
String str;

public static Singleton method3(String s)
{
  // str=s;  // non-static variables cannot be used in static method
return new Singleton();
}
public void method4()
{
	System.out.println(str);

}


}
