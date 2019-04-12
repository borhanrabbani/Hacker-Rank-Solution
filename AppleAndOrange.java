package hackerRankProblem;

import java.io.*;
import java.util.*;

public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int appleCount=0;
		int orangeCount=0;
		
		int apple[] = new int[m];
		int orange[] = new int[n];
		for(int i=0; i<m; i++){
			apple[i] = sc.nextInt();
			apple[i] = apple[i]+a;
			if(apple[i]>=s && apple[i]<=t){
				appleCount++;
			}
		}
		for(int j=0; j<n; j++){
			orange[j] = sc.nextInt();
			orange[j] = orange[j]+b;
			if(orange[j]>=s && orange[j]<=t){
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);

	}

}
