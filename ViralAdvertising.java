package hackerRankProblem;
import java.util.*;


public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int Share=5;
		int totalShare=0;
		int like=0;
		int CLike=0;
		
		for(int i=1; i<=n; i++){
			if(i==1){
				//Share=5;
				like=Share/2;
				Share=like*3;
			}
			else
			{
				like=Share/2;
				Share=like*3;
			}
			CLike=CLike+like;
		}
		System.out.println(CLike);
	}

}
