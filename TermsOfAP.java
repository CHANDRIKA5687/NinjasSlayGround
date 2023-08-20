package ninjaslayground;

import java.util.* ;
import java.io.*; 
public class TermsOfAP {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int N=1;
		int arr[]=new int[x];
		int i=0;
		while(i<x){
			int term=3*N+2;
			if (term%4!=0){
				arr[i]=term;
				N++;
				i++;
			}
			else{
				N++;
			}
		}
		return arr;
	}
}