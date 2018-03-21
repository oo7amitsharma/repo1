package com.hash.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(a);
	ArrayList<Integer>  lst = new ArrayList<Integer>();
		 lst.add(1);
		 lst.add(3);
		lst.add(4);
		 lst.add(1);
		 lst.add(3);
	//	list.add("Amit");
		
//		Collection<String> collection = new ArrayList<String>();
		
		System.out.println("Output of Arraylist:");
		for(int a : lst){
			
			System.out.println(a);
		}
		
		
		System.out.println("Output of HashSet:");
		HashSet<Integer> set = new HashSet<Integer>(lst);
		
		for(int c : set){
			
			System.out.println(c);
		}
		
		
		

	}

}
