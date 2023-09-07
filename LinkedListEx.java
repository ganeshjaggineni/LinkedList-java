package linkedlistexamples;

public class LinkedListEx {
	class Node{
		int data;
		Node next;
		//creating constructor
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public Node head=null;
	public void addFirst(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
		
	}
	public void display()
	{
		Node temp = head;
		if(head == null)
				System.out.println("linked list is empty");
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String args[])
	{
		LinkedListEx list = new LinkedListEx();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		
		list.display();
	}
}
