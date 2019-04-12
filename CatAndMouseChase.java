package hackerRankProblem;

import java.util.*;
import java.math.*;


public class CatAndMouseChase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int catA[]=new int[n];
		int catB[]=new int[n];
		int mouseC[]=new int[n];
		for(int i=0; i<n; i++){
			catA[i]=sc.nextInt();
			catB[i]=sc.nextInt();
			mouseC[i]=sc.nextInt();
			int disA=Math.abs(mouseC[i]-catA[i]);
			int disB=Math.abs(mouseC[i]-catB[i]);
			if(disA==disB){
				System.out.println("Mouse C");
			}
			if(disA<disB){
				System.out.println("Cat A");
			}
			if(disB<disA){
				System.out.println("Cat B");
			}
		}

	}

}
