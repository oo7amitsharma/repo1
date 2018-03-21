package com.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Book {
	
	int id, quantity;
	String name, author, publisher;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Book> map=new HashMap<Integer,Book>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 6);
		Book b3 = new Book(103, "Operating System", "Galvin ", "Wiley", 5);
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		
		
	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
          int key=entry.getKey();  
          Book b=entry.getValue();  
          System.out.println(key+" Details:");  
          System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		                   
	    }
		
	}
	
	
	public Book(int id, String name, String author, String publisher, int quantity){
		
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;		
	//	Map<Integer, Book> map =new java.util.HashMap<Integer, Book>();
		
	//    Map<Integer,Book> map=new HashMap<Integer,Book>();    

		
		
	}

}
