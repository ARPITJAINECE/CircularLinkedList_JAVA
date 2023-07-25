package circularLinkedList;

public class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		head = null;
	}

	// insertion of the data
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		// insert at first
		if (head == null) {
			head = newNode;
			newNode.setNext(newNode);// to make it circular
			return true;
		}
		// insert at last
		Node last = head;
		while (last.getNext() != head) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);
		return true;
	}

	// display the CLL
	public void disp() {
		if (head == null) {
			return;
		}
		Node temp = head;
		do {
			System.out.println(temp.getData());
			temp = temp.getNext();
		} while (temp != head);
	}

	// insert at any position
	public boolean insertAtAnyPos(int pos, int data) {
		if (pos < 0 || head == null) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		// insert at pos==1
		if (pos == 1) {
			// if list is empty
			if (head == null) {
				head = newNode;
				newNode.setNext(head);
				return true;
			}
			// if list is not empty
			newNode.setNext(head);
			//// insert at last
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			last.setNext(newNode);
			head = newNode;
			return true;
		}
		// insert at any position
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == head) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	// deletion by value
	public boolean deleteByValue(int data) {
		if (head == null) {
			return false;
		}
		if (data == head.getData()) {
			// if list is having one node only
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			// if list is having mre than one node
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			last.setNext(head.getNext());
			head = head.getNext();
			return true;
		}
		Node prev = head;
		Node deletable = head;
		while (deletable.getData() != data) {
			prev = deletable;
			deletable = deletable.getNext();
			if (deletable == head) {
				return false;
			}
		}
		prev.setNext(deletable.getNext());
		return true;
	}

	// delete by position
	public boolean deleteByPosition(int pos) {
		if (pos < 0 || head == null) {
			return false;
		}
		// first position deletion
		if (pos == 1) {
			// if only head node is there
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			// more than one node is there
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			last.setNext(head.getNext());
			head = head.getNext();
			return true;
		}
		Node prev = head;
		Node deletable = head;
		for (int i = 1; i < pos; i++) {
			prev = deletable;
			deletable = deletable.getNext();
			if (deletable == head) {
				return false;
			}
		}
		prev.setNext(deletable.getNext());
		return true;
	}

}
