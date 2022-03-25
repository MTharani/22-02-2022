package com.samplearray2;

public class Typeofarray1 {

	public static void main(String[] args) 
	{
		// single dimensional array-multiple line
		int studentid[]=new int[5];  //array object creation
		
		//array initialization 
		studentid[0]=569;
		studentid[1]=686;
		studentid[2]=989;
		studentid[3]=555;
		studentid[4]=323;
		for(int i=0;i<studentid.length;i++)
	       {
	    	   System.out.println(studentid[i]);
	       }

          System.out.println("**********");
          System.out.println(studentid[4]);
          System.out.println("**********");
          System.out.println("index of the array");
          System.out.println(studentid.length);

	}

}
