package linkedlistexamples;
import java.util.Scanner;
public class DelNthNodeFromEnd {
	
	class Node
	{
		int data;
		Node next;
	}
	public Node head;
	
	void addLast(int data)
	{
		Node newnode = new Node();
		newnode.data=data;
		if(head == null)
		{
			head=newnode;
			newnode.next = null;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next = newnode;
		}
	}
	void showList()
	{
		if(head == null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}

	void delNthCountMethod()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nth node to delete from end");
		int n = sc.nextInt();
		if(head==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			int count=0;
			Node curr=head;
			while(curr != null)
			{
				count++;
				curr = curr.next;
			}
			curr = head;
			for(int i=1;i<count-n;i++)
			{
				curr=curr.next;
			}
			curr.next = curr.next.next;
		}
	}
	void slowFastNthNodeDel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nth node to delete from end");
		int n = sc.nextInt();
		if(head==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			Node slow=head;
			Node fast=head;
			for(int i=1;i<=n;i++)
			{
				fast=fast.next;
			}
			while( fast != null && fast.next != null )
			{				slow=slow.next;
				fast=fast.next;
			}
			slow.next = slow.next.next;
		}
	}
	public static void main(String args[])
	{
		DelNthNodeFromEnd list = new DelNthNodeFromEnd();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		System.out.println("before deleting nth node from end");
		list.showList();
//		list.delNthCountMethod();
//		System.out.println("after deleting nth node from end using lengthmethod");
//		list.showList();
		list.slowFastNthNodeDel();
		System.out.println("after deleting nth node from end using twopointermethod or tortoise approach");
		list.showList();
		
	}
}
