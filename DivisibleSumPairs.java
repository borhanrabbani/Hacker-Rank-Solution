package hackerRankProblem;

import java.util.*;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum=0;
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			int min=i;
			int minVal=a[i];
			for(int j=i+1; j<n; j++){
				if(min<j){
					if((minVal+a[j])%k==0){
						sum++;
						//System.out.println(minVal + " " + a[j]);
					}
				}
			}
		}
		//Incomplete
		System.out.println(sum);

	}

}
