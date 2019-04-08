package hackerRankProblem;
import java.util.*;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int exclude=0;
		int sum=0;
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			exclude = a[k];
			sum +=a[i];
		}
		int b = sc.nextInt();
		int hold = sum-exclude;
		if((hold/2)==b){
			System.out.println("Bon Appetit");
		}else{
			int refund = b-(hold/2);
			System.out.println(refund);
		}

	}

}
