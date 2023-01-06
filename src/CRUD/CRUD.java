package CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import Exception.BookEntryException;
import entity.BookDetails;

public class CRUD {
	static Collection<BookDetails> bookDetails = new ArrayList<BookDetails>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int ch = 0;
		do {
	
			System.out.println("Welcome..");
			System.out.println("Press 1 to add new books");
			System.out.println("Press 2 to view all book details");
			System.out.println("Press 3 to search a book");
			System.out.println("Press 4 to delete a book");
			System.out.println("Press 5 to update a book");
			
			try {	
			ch = sc.nextInt();
			
	}
			
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
			
			
			switch(ch)
			{
			case 1:
				System.out.print("Please enter the no. of books you want to enter: ");
			
				
		        int size = sc.nextInt();
				
				
			
		        for (int j = 0; j < size; j++) {
					System.out.println("Enter Book Details");
					System.out.print("Enter Book Name : ");
					String name1 = s.nextLine();
					System.out.print("Enter Book topic : ");
					String topic1 = s.nextLine();
					System.out.print("Enter Book author : ");
					String author1 = s.nextLine();
					Functions.name = name1;
					Functions.topic = topic1;
					Functions.author = author1;
					Functions.add(name1,topic1,author1);
				
					System.out.println("Details entered successfully..");
					}
				//bookDetails.add(new BookDetails(name1, topic1, author1));
				
				break;
				
			case 2:
				Functions.show();
				
				break;
			case 3:
				String name2 = "";
				Functions.name = name2;
				Functions.search(name2);
				break;
				
			case 4:
				String name3 = "";
				Functions.name = name3;
				Functions.delete(name3);
				break;
				
			case 5:
				
					
				String name4 = "";
				Functions.name = name4;
				Functions.delete(name4);
				System.out.println("Enter Updates");
				System.out.print("Enter Book Name : ");
				String uname = s.nextLine();
				System.out.print("Enter Book topic : ");
				String utopic = s.nextLine();
				System.out.print("Enter Book author : ");
				String uauthor = s.nextLine();
				Functions.name = uname;
				Functions.topic = utopic;
				Functions.author = uauthor;
				Functions.add(uname,utopic,uauthor);
			
				System.out.println("Details entered successfully..");
				
	
				break;
				
			}
		
			
		}while(ch!=0);
}

}
