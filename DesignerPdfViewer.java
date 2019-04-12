package hackerRankProblem;
import java.util.*;

public class DesignerPdfViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[26];
		
		int i=0;
		
		while(i<26){
			a[i]=sc.nextInt();
			i++;
		}
		
		String word = sc.next();
		
		int maxLen=0;
		int hA=0;
		
		for(int j=0; j<word.length(); j++){
			hA=word.charAt(j)-97;
			if(maxLen<a[hA]){
				maxLen = a[hA];
			}
		}
		int result = word.length()*maxLen;
		System.out.println(result);
	}
}
