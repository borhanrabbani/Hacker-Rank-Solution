package hackerRankProblem;

import java.util.*;

public class MigratoryBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int type[] = new int[5];
		int sum=0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		/*for(int i=0; i<n; i++){
			int type = a[i];
			int idx =i;
			int count =0;
			for(int j=0; j<n; j++){
				if(type==a[j]){
					count++;
					//a[j]=0;
				}
			}
			System.out.print(count + " ");
		}*/
		for(int i=1; i<=5; i++){
			int t=i;
			for(int j=0; j<n; j++){
				if(t==a[j]){
			// Inocmplete		
				}
			}
		}
		

	}

}
