package javaprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public	static int  flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter any number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Entered Number is: "+ number);
		for(int i =2; i<=number/2; i++){
		
			if(number%i==0){
				flag =1;
			//	System.out.println("The value of flag is: "+ flag);
				break;
			}
			
			
		}
		
		if(flag==0){
			
			System.out.println("Number is Prime");
		}
		
		else{
			
			System.out.println("Number is not prime");
		}

	}

}
