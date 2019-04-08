package hackerRankProblem;
import java.util.*;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int p=0,max=0;
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		if(max>k)
			p=max-k;
		
		System.out.println(p);

	}

}
