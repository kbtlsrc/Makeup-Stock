package Trying;

public class Node {
	
	private Product item;
	private Node prev;
	private Node next;
	
	public Node() {
		prev  = null;
		next = null;
		item = null;
		// TODO Auto-generated constructor stub
	}
	
	public Node (Product newItem) {
		setItem(newItem);
		prev = null;
		next = null;
	}
	
	public Node (Product newItem, Node nextValue) {
		setItem(newItem);
		prev = null;
		next = nextValue;
	
	}
	
	public Node(Product newItem, Node prevValue, Node nextValue)
	{
		setItem(newItem);
		prev = prevValue;
		next = nextValue;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

}
