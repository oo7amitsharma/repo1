package javaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class test {
	
	/**
	 * @param args
	 */
	public static void main(String []args){
	
		int[] arr = { 2, 6, 4, 2, 3, 3, 1, 7 };
		System.out.println("Add Array values to set");
		Set<Integer> set = new HashSet<>();
		for(int v : arr){
			set.add(v);
			
		}
		
		Iterator itr = set.iterator();
		
		System.out.println("Array values aded to set");
		int sizeofset = set.size();
		System.out.println("Size of set: "+sizeofset);
		for(int a=1; a<=sizeofset; a++){
		System.out.println(itr.next());}
		
		
		
	/*	for(int b: set){
			
			System.out.println(itr.next());
		}*/


	}

}
