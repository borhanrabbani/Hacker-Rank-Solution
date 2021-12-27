package hackerRank;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int first[] = new int[n];
		int sec[] = new int[m];

		for (int i = 0; i < n; i++) {
			first[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			sec[i] = sc.nextInt();
		}
		
		int count =0;
		for(int i=1; i<=100; i++) {
			
			boolean flag = true;
			
			for(int j=0; j<n && flag; j++) {
				if(i%first[j]!=0) {
					flag=false;
				}
			}
			
			for(int j=0; j<m && flag; j++) {
				if(sec[j]%i !=0) {
					flag = false;
				}
			}
			
			if(flag)
				count++;
		}
		
		System.out.println(count);
		
		sc.close();

	}

}
