package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, rev = 0;
		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println(number);
		while(number != 0){
			
			rev = rev * 10;
			rev = rev + number%10;
			System.out.println(rev);
			number = number/10;
			System.out.println("Number is: "+number);
			
		}
		
       System.out.println(rev);
	}

}
