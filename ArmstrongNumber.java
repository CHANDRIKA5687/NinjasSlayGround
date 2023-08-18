package persistent;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static boolean armstrongNum(int n) {
		int n1=n;
		int temp = n;
		int sum=0;
		int rem=0;
		int digit=0;
		while(n1>0) {
			int last_index=n1%10;
			digit++;
			n1=n1/10;
		}
		while(temp>0) {
			rem=temp%10;
			sum=(int) (sum + Math.pow(rem, digit));
			temp =temp/10;
		}
		if(sum==n) {
			return true;
		}
		
		return false;		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(armstrongNum(n));
		
	}

}
