package hackerRankProblem;
import java.util.*;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a[] = new long[5];
		long max=0,sum=0;
		long min = Long.MAX_VALUE;
		
		for(int i=0; i<5; i++){
			a[i]=sc.nextLong();
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
			
			sum=sum+a[i];
			}
		long maxSum=sum-min;
		long minSum=sum-max;
		
		/*System.out.println(min);
		System.out.println(max);*/
		System.out.print(minSum + " " + maxSum);
		
	}

}
