package com.samplearray2;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the character");
		String text= scanner.nextLine();
		char[]arr=text.toCharArray();
		int n=arr.length;
		String str="";
		scanner.close();
		for(int i=n-1;i>-1;i--)
		{
			str=str+arr[i];
		}
		System.out.println("display the character");
         System.out.println(str);
	}

}
