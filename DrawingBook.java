package hackerRankProblem;

import java.util.*;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count1=1, count2=1;
		if((p==n)||(p==1)){
			System.out.println(0);
			System.exit(0); 
		}
		if((n%2!=0)&&(p==n-1)){
			System.out.println(0);
			System.exit(0);
		}
		for(int i=1; i<n; i=i+2){
			if((p==i) ||(p==i+1)){
				break;
			}else
				count1++;
		}
		for(int i=n; i>=2; i=i-2){
			if((p==i) ||(p==i-1)){
				break;
			}else
				count2++;
		}
		if(count1<count2)
			System.out.println(count1);
		if(count2<count1)
			System.out.println(count2);
		
	}

}
