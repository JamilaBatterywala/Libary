package CRUD;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Exception.BookEntryException;

import entity.BookDetails;

public class Functions {
	static Collection<BookDetails> bookDetails = new HashSet<BookDetails>(); 
	static String name;
	static String topic;
	static String author;
	
	
public static void add(String name , String topic , String author)  {
	
	boolean flag=bookDetails.add(new BookDetails(name, topic, author));
	if(flag==false)
	{
		throw new BookEntryException("Duplicate entry");
		
	}
	}
	
public static void show() {
		
		
	Iterator<BookDetails> i = bookDetails.iterator();
	if(bookDetails.isEmpty()==true)
	{
		System.out.println("No books found");
	}
	while(i.hasNext()) {
		BookDetails b = i.next();
		System.out.println(b);
	}
	
	}
public static void search(String name) {
	Scanner s = new Scanner(System.in);
	if(bookDetails.isEmpty()==true)
	{
		System.out.println("No books found");
	}

	boolean found = false;
	Iterator<BookDetails> i = bookDetails.iterator();
	i = bookDetails.iterator();
	System.out.print("Please enter book name: ");
	name = s.nextLine();
	while(i.hasNext()) {
		
		BookDetails b = i.next();
		if(b.getName().contains(name))
		{
			System.out.println(b);
			found = true;
		}
		if(!found)
		{
			throw new BookEntryException("Please enter correct name");
		}
	}

	
	}
public static void delete(String name) {
	if(bookDetails.isEmpty()==true)
	{
		System.out.println("No books found");
	}
	Scanner s = new Scanner(System.in);
	boolean found1 = false;
	Iterator<BookDetails> i = bookDetails.iterator();
	i = bookDetails.iterator();
	System.out.print("Please enter book name: ");
	name = s.nextLine();
	while(i.hasNext()) {
		
		BookDetails b = i.next();
		if(b.getName().contains(name))
		{
			
			i.remove();
			//System.out.println(b);
			found1 = true;
			
		}
		
	}
	if(!found1)
	{
		throw new BookEntryException("Enter book name correctly");
	}
}



}
