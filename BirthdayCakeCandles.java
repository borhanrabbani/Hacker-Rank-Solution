package hackerRankProblem;
import java.util.*;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max=0, oc=0;
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			
			if(max<a[i]){
				max=a[i];
			}
		}
		for(int i=0; i<n; i++){
			if(a[i]==max){
				oc++;
			}
		}
		System.out.print(oc);
	}

}
