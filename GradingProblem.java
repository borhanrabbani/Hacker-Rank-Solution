package hackerRankProblem;

import java.util.*;

public class GradingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] =new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			
			if(a[i]<38){
				a[i]=a[i];
			}
			if(a[i]>=38){
				int round=a[i]%5;
				if((5-round)<3){
					a[i]=a[i]+(5-round);
				}else{
					a[i]=a[i];
				}
			}
			System.out.println(a[i]);
		}

	}

}
