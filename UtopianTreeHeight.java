package hackerRankProblem;
import java.util.*;

public class UtopianTreeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int a[] = new int[n];
		int t;
		
		for(int i=0; i<n; i++){
			t=sc.nextInt();
			int init=1;
			for(int j=1; j<=t; j++){
				if(j%2==0){
					init=init+1;
				}
				else
					init=init+init;
			}
			System.out.println(init);
		}

	}

}
