package hackerRankProblem;
import java.util.*;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int n,candy,start;
		
		for(int i=0; i<t; i++){
			n=sc.nextInt();
			candy=sc.nextInt();
			start=sc.nextInt();
			
			int poisonedPrisoner=(candy+start-1)%n;
			if(poisonedPrisoner==0)
				poisonedPrisoner=n;
			
			System.out.println(poisonedPrisoner);
		}

	}

}
