package hackerRankProblem;

import java.util.*;
import java.io.*;

public class CountingValley {

	
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Please enter elements...");
        int n = sc.nextInt();
        sc.nextLine();
        String terrain = sc.nextLine();
        int level=0;
        int valleys=0;
        boolean belowsea = false;
        
        for(int i=0; i<n; i++){
        	char slope = terrain.charAt(i);
        	if(slope=='U')
        		level++;
        	else 
        		level--;
        	if(!belowsea && level<0){
        		valleys++;
        		belowsea = true;
        	}
        	
        	if(level >= 0){
        		belowsea=false;
        	}
        }
        System.out.println(valleys);
    }
	

}
