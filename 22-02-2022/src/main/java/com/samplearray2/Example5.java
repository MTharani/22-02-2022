package com.samplearray2;

public class Example5 {

	public static void main(String[] args) 
	{
		int matrix[][]=new int [2][3];

		matrix[0][0]=1;
		matrix[0][1]=0;
		matrix[0][2]=0;

		matrix[1][0]=0;
		matrix[1][1]=1;
		matrix[1][2]=0;

		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");

		}

	}

}
