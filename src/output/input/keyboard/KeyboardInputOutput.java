package output.input.keyboard;

import java.util.Scanner;

public class KeyboardInputOutput {
	
	
	public static void main(String []args){
		
	System.out.println("Enter any Numbr");
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();
	System.out.println(x);
	String y = sc.next();
	System.out.println(y);
	}

}
