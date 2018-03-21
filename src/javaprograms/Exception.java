package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(3/0);=;
		
		int x =12345;
	//System.out.println(x.count);
		int l = String.valueOf(x).length();
		System.out.println(l);
		
		
		int a[] = {5,4,3,2,1};
		List<Integer> digits = new ArrayList<Integer>();
			int number = 1234567890; while (number > 0) {
				int digit = number % 10; 
			// Store digit in a variable 
			number = number/10; 
			// Add digit to the list 
			digits.add(digit); 
			}
			}
	
		


	}

}
