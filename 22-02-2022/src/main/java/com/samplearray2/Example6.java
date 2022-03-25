package com.samplearray2;

public class Example6 {

	public static void main(String[] args) {
		// multi dimensioanl array - multiple line
		int matrix[][]=new int [3][2];

		matrix[0][0]=1;
		matrix[0][1]=0;
	
		matrix[1][0]=0;
		matrix[1][1]=1;
		
		matrix[2][0]=1;
		matrix[2][1]=0;
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");

		}

	}

}
