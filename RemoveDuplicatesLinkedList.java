package linkedlistexamples;
import java.util.Scanner;

import linkedlistexamples.RevLinkedList.Node;



public class RemoveDuplicatesLinkedList {
	class Node
	{
		int data;
		Node next;
	}
	public Node head=null;
	
	public void addFirst(int data)
	{
		Node newnode = new Node();
		newnode.data=data;
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
	public void removeDup()
	{
	
		if(head==null)
		{
			System.out.println(head.data+"->null");
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				if(temp.data==temp.next.data)
						temp.next = temp.next.next;
				else
					temp = temp.next;
			}
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

	public static void main(String args[])
	{
		RemoveDuplicatesLinkedList list = new RemoveDuplicatesLinkedList();
		Scanner sc = new Scanner(System.in);

		
		list.display();
		list.addFirst(500);
		list.addFirst(400);
		list.addFirst(300);
		list.addFirst(300);
		list.addFirst(300);
		list.addFirst(300);
		list.addFirst(100);
		list.addFirst(100);
		list.addFirst(100);
		list.addFirst(100);

		list.display();
		list.removeDup();
		list.display();


		
	}
}
