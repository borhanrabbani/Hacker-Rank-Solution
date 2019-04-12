package hackerRankProblem;

import java.util.*;

public class BreakingRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxCount=0;
		int minCount=0;
		int min=0,max=0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(i==0){
				max=a[0];
				min=a[0];
			}
			if(a[i]>max){
				maxCount++;
				max=a[i];
			}
			if(a[i]<min){
				minCount++;
				min=a[i];
			}
		}
		System.out.println(maxCount + " " + minCount);
		//System.out.println(minCount);

	}

}
