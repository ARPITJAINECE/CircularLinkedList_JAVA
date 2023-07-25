package circularLinkedList;

public class TesterCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.insert(50);
		cll.disp();
		System.out.println("after inserting at given pos");
		cll.insertAtAnyPos(3, 25);
		cll.disp();
		System.out.println("deletion by value");
		cll.deleteByValue(25);
		cll.disp();
		System.out.println("deletion by position");
		cll.deleteByPosition(5);
		cll.disp();
	}
}
