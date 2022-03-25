package com.samplearray2;

public class Example1 {

	public static void main(String[] args) 
	{
		int studentrollnumber[]= {23,45,66,85,15,46};
		System.out.println("index of the array is:"+studentrollnumber.length);
		System.out.println("==============");
		System.out.println(studentrollnumber[3]);
		System.out.println("**************");
		System.out.println("ALL STUDENTS OF ROLL NUMBER IN THE CLASS");
		for(int i=0;i<studentrollnumber.length;i++)
		{
			System.out.println(studentrollnumber[i]);
		}

	}

}
