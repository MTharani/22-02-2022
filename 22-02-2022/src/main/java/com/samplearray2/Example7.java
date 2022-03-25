package com.samplearray2;

public class Example7 {

	public static void main(String[] args)
	{
int matrix[][]=new int [4][3];
		
		matrix[0][0]=1;
		matrix[0][1]=0;
		matrix[0][2]=1;
		
		matrix[1][0]=2;
		matrix[1][1]=0;
		matrix[1][2]=2;
		
		matrix[2][0]=3;
		matrix[2][1]=0;
		matrix[2][2]=3;
		
		matrix[3][0]=4;
		matrix[3][1]=0;
		matrix[3][2]=4;
		
		for(int i=0;i<4;i++)
        {
      	  for(int j=0;j<3;j++)
      	  {
      		  System.out.print(matrix[i][j]+"\t");
      	  }
      	System.out.println("\n\n");

        }

	}

}
