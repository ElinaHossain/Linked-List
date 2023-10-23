public interface LinkedListInterface<T> {

	// O(1)
	public void newHead(T head); // replace current head node
	
	// O(1)
	public void deleteHead(); // delete current head node
	
	// O(n)
	public void newTail(T tail); // replace current tail node
	
	// O(n)
	public void deleteTail(); // delete current tail node
	
	// O(n)
	public boolean contains(T item); // search for an item in the linked list, return true if found, false otherwise
	
	// O(n)
	public void deleteItem(T item); // if found, delete the item 
	
	// O(1)
	public void clear(); // destroy the linked list
	
	// O(1)
	public int size(); // return size of the linked list
	
	// O(1)
	public boolean isEmpty(); // return true if linked list if empty, false otherwise

}