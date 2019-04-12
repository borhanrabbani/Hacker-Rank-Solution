package hackerRankProblem;

import java.util.Scanner;
import java.io.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=sc.nextInt();
				if(i==j){
					sum1=sum1+arr[i][i];
				}
				if(i+j==n-1){
					sum2=sum2+arr[i][j];
				}
			}
			
		}
		int difference= Math.abs(sum2-sum1);
		//System.out.println(sum1);
		//System.out.println(sum2);
		System.out.println(difference);
		/*System.out.println("Data in the 2d Array :");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
	}

}
