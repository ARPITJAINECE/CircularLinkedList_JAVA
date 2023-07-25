package circularLinkedList;

public class Node {
	private int data;
	private Node next;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
