package hackerRankProblem;

import java.util.*;

public class KangarooJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		
		while(x1 <= x2){
			if(x1==x2){
				System.out.println("YES");
				System.exit(0);
			}
			x1 +=v1;
			x2 +=v2;
		}
		System.out.println("NO");
	}

}
