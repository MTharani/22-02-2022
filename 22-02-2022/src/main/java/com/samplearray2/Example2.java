package com.samplearray2;

public class Example2 {

	public static void main(String[] args)
	{
		String studentname[]= {"thara","divi","sai","dheju","mithu"};
		System.out.println("ALL THE STUDENT NAME");
		for(String name:studentname)
		{
			System.out.println(name);
		}
		System.out.println("***************");
		System.out.println("index of the array is:"+studentname.length);
		System.out.println("***************");
        System.out.println(studentname[3]);
	}

}
