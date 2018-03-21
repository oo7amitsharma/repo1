package javaprograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class finddulpicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		int array[] = {1, 2, 5, 7, 2, 1, 7, 5, 6, 4, 9};
	//	System.out.println(array.length);
		
		Set mySet = new HashSet(Arrays.asList(array));
		Set<Integer> set = new HashSet<>();
	//	System.out.println(set);
		for(int v : array){
			set.add(v);
			
		             }
	//	System.out.println(set);
		int sizeofset = set.size();
	//	System.out.println("Size of Set is :"+ sizeofset);
		
		Integer[] newset=new Integer[sizeofset];
	set.toArray(newset);
	for(Integer str: newset){
//	System.out.println(newset[]);       
		
		
	             }
	
	//System.out.println(newset[6]);
	
	for(int i = 0; i<newset.length; i++){
		counter =0;
		for(int j=0; j<array.length; j++){
			
			if(newset[i] ==array[j]){
				counter = counter+1;
			}
			
		}
		System.out.println("The frequency of " + newset[i] + " is: " +counter);
		
	}
	}	

	}


