package com.samplearray2;

public class Example3 {

	public static void main(String[] args) {
		// multi-dimensional array-single line
          int matrix[][]= {{28,66},{45,96}};
          for(int i=0;i<matrix.length;i++)
          {
        	  for(int j=0;j<matrix.length;j++)
        	  {
        		  System.out.print(matrix[i][j]+"\t");
        	  }
        	  System.out.println("\n\n");
	}
	}
}
