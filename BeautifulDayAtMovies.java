package hackerRankProblem;
import java.util.*;
import java.math.*;

public class BeautifulDayAtMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int div=sc.nextInt();
		int count=0;
		for(int i=start; i<=end; i++){
			int reverse=0;
			int n=i;
			while(n!=0){
				reverse = reverse * 10;
				reverse = reverse + n%10;
				n=n/10;
			}
			int sub= Math.abs(i-reverse);
			if(sub%div==0)
				count++;
		}
		
		System.out.println(count);
	}

}
