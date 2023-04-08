package HW;

import java.util.Arrays;

public class biggestnumberarrya {
	
	
	public static int secondlargestnumber (int[]a, int total) {
		Arrays.sort(a);
		return a[total-2];
		
	}
	
	public static void main (String[] args) {
		int a[] ={1,2,3,4,53,62,7,};	
		System.out.println("Second largest:"+ secondlargestnumber (a,7));
		
		
		
	}

}
