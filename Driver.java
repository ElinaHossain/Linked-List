import java.util.Scanner;
class Driver {

	public static void main(String[] args) {
	
      	Scanner sc = new Scanner(System.in);

		LinkedList<Book> books = new LinkedList<Book>(); // Complete ALL unimplemented Methods
      
      System.out.print("Enter number of books: " );
		String numberOfBooksStr = sc.nextLine();
		int numberOfBooks = Integer.parseInt(numberOfBooksStr);
		
		System.out.println("numberOfBooksStr: " + numberOfBooksStr);
		System.out.println("numberOfBooks: " + numberOfBooks);
		
		Book[] booksA = new Book[numberOfBooks];
      
      	System.out.println("Printing List: ");
      	books.print();
		   int i;
		   for(i = 0; i < numberOfBooks; i++) {
			System.out.print("Enter name of book: ");
			String name = sc.nextLine();
			System.out.print("Enter ISBN of book: ");
			int ISBN = Integer.parseInt(sc.nextLine());
			booksA[i] = new Book(name, ISBN); 
			books.newHead(booksA[i]); 
		   }
      
      	System.out.println("Enter the name of book: ");
      	String name = sc.nextLine();
      	System.out.print("Enter ISBN of book: ");
      	int ISBN = Integer.parseInt(sc.nextLine());
      	booksA[numberOfBooks - 1] = new Book(name, ISBN);
      	books.newTail(booksA[numberOfBooks - 1]);
      
      	System.out.println("Printing List with " + numberOfBooks + " books: ");
      	books.print();
      	boolean IsEmpty = books.isEmpty();
      	System.out.println("Is the List Empty? " + IsEmpty);
      	System.out.println("Size: " + books.size());
      
      	System.out.println("\n " + "Enter a book to remove:");
         String bookToRemove = sc.nextLine();
         for (int j = 0; j < numberOfBooks - 1; j++) {
         if (booksA[j].getName().equals(bookToRemove)) {
         books.deleteItem(booksA[j]);
         }
         }
         
      	System.out.println("Deleting Tail");
      	books.deleteTail();
         
         
      	System.out.println("Deleting Head");
      	books.deleteHead();
         

      	System.out.println("Printing List: ");
      	books.print(); 
      
      	System.out.println("Search for item that matches the data of the head node: " + books.contains(booksA[0]));
		   System.out.println("Search for item that matches the data of the tail node: " + books.contains(booksA[numberOfBooks - 1]));

      	
		   books.clear();
      	System.out.println("Size: " + books.size());
     	   IsEmpty = books.isEmpty();
      	System.out.println("Is the List Empty? " + IsEmpty);
      
      	System.out.println("Delete something that existed in the past...");
		   Book bookToDelete = booksA[2];
		   if (books.contains(bookToDelete)) {
    	   books.deleteItem(bookToDelete);
    	   System.out.println("Item deleted!");
		   } else {
    			System.out.println("Item not found in the linked list.");
		   }
      
      	System.out.println("Search for something that existed in the past: ");
		   Book bookToSearch = booksA[2];
		   if (books.contains(bookToSearch)) {
    	   System.out.println("Item found in the linked list.");
		   } else {
    			System.out.println("Item not found in the linked list.");
		   }      
      	System.out.println("Printing List: ");
      	books.print();      	
      	
	}
}