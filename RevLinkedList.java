package linkedlistexamples;

public class RevLinkedList {
	class Node
	{
		int data;
		Node next;
		
		//creating constructor
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}
	public Node head=null;
	public void addFirst(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			newnode.next = null;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			Node curr=head;
			System.out.println("");
			while(curr!=null)
			{
				System.out.print(curr.data+"->");
				curr=curr.next;
			}
			System.out.print("null");
		}
	}
	
	
	public void  RevLinkList()
	{
		if(head==null)
		{
			System.out.println("can't reverse because linked list is empty");
		}
		Node prev=null;
		Node curr=head;
		Node nextnode=null;
		while(curr != null)
		{
			nextnode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextnode;
		}
		//updating the head to the new head of reversed linked list
		head = prev;
		
		
	}

	public static void main(String args[])
	
	{
		RevLinkedList obj = new RevLinkedList();
		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.addFirst(40);
		obj.addFirst(50);
		System.out.println("before reversing a linked list :");
		obj.display();
		obj.RevLinkList();
		System.out.println("\nafter reversing a linked list :");
		obj.display();
		
	}

}
