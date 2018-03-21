package com.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello This is First Map Program");
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(null, "null");
		map.put(106, "E");
	//	map.put(null, "Null");
		System.out.println(map);
//		System.out.println("==========================");	
//		System.out.println("Print the values by the get function on the basis of keys");
//		
//		System.out.println(map.get(104));
//		
//		System.out.println("==========================");
//		System.out.println("Print by Function contains Value");
//		System.out.println(map.containsValue("D"));
//		
//		Set<Integer> set=map.keySet();
//		System.out.println("==========================");
//		System.out.println("Print by Function Contains which return all map keys");
//		for(int m: set)
//		{
//		
//		System.out.println(m);
//		}
//		
//		System.out.println("==========================");
//		System.out.println("Print by Function entry level set which return all map keys and values");
//		for(Map.Entry me: map.entrySet()){
//		System.out.println(me.getKey()+":"+me.getValue());
//		}
//		
//		System.out.println(map);
	}

}
