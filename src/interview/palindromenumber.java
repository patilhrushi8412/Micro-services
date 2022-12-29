package interview;

import java.util.Iterator;

public class palindromenumber {

	public static void main(String[] args) {
		
		int a=1452;
		int temp=a;
		int rem=0;
		
		for (int i = 0; i < temp; i++) {
			rem=temp%10;
			rem=rem+rem*10;
			temp=temp/10;
		}
		System.out.println(rem);
	}
}
