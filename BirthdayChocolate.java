package hackerRankProblem;

import java.util.*;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		
		for(int j=0; j<n; j++){
			int sum=0;
			for(int k=j; k<m; k++){
				sum =sum+ a[k];
			}
			System.out.println(sum);
			if(sum==d){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
