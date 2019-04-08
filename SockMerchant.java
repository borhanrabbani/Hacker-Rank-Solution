package hackerRankProblem;
import java.util.*;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		//int hold[] = new int[n];
		
		int cur=0;
		for(int i=0;  i<n; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			cur =a[i];
			int count=0;
			for(int j=i; j<n; j++){
				if(cur==a[j]){
					count++;
				}
			}
			if(count%2==0){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
