package HW;

import java.util.Arrays;

public class Tryarray {
	
	public static int secondlargestnumber (int[]a, int total) {
		Arrays.sort(a);
		return a[total-2];
		
	}
	
	public static void main (String[] args) {
		int a[] ={1,2,3,4,5,6,7,};
		int b[]= {10,20,30,40,50,60,70,};
		
		
		System.out.println("First largest:"+ secondlargestnumber (a,7));
		System.out.println("second lagest:"+secondlargestnumber(b,7));
		
		
		
	}
	

}
