package hackerRankProblem;
import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			int stu=sc.nextInt();
			int t=sc.nextInt();
			int a[]=new int[stu];
			int count=0;
			for(int j=0; j<stu; j++){
				a[j]=sc.nextInt();
				if(a[j]<=0)
					count++;
			}
			if(count>=t)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
