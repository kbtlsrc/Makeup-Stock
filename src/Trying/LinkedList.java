package Trying;

public class LinkedList extends Test {
	
	private Node first;
	private Node last;
	
	public LinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insert(Product item) {
		if(isEmpty())
			first = last = new Node(item);
		else {
			Node a = new Node(item);
			a.setNext(first);
			first.setPrev(a);
			first = a;
		}
	}
	
	public int size() {
		int count = 0;
		Node current = first;
		while(current != null) {
			count++;
			current.getNext();
		}
		return count;
	}
	
	
	public void outputList() {
		
		Node current = first;
		while(current != null) {
			System.out.println(current.getItem());
			current = current.getNext();
		}
	}

	
}
