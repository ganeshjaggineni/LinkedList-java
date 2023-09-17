package linkedlistexamples;

public class MidOfLinkedList {

	class Node
	{
		int data;
		Node next;
	}
	public Node head;
	void addFirst(int data)
	{
		Node newnode = new Node();
		newnode.data=data;
		if(head == null)
		{
			head=newnode;
			newnode.next=null;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	void display()
	{
		if(head == null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
		}
	}
	
	void countMethod()
	{
		Node curr = head;
		int count=0;
		while(curr!= null)
		{
			curr = curr.next;
			count++;
		}
//		System.out.println(count);
		curr = head;
//		  for (int i = 0; i < count / 2; i++) {
//		        curr = curr.next;
//		    }
		int n=count/2;
		while(n != 0)
		{	
			curr=curr.next;
			n--;
			
		}
		System.out.println("\nThe mid element of linked list using countmethod = "+curr.data);
	}
	
	void slowFastApproach()
	{
		Node slow=head,fast=head;
		while(fast != null && fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
		}
		System.out.println("The mid element of linked list using tortoise or slowfast pointer approach is = "+slow.data);

		
	}
	
	public static void main(String args[])
	{
		MidOfLinkedList listele = new MidOfLinkedList();
		listele.addFirst(50);
		listele.addFirst(40);
		listele.addFirst(30);
		listele.addFirst(20);
		listele.addFirst(10);
		listele.display();
		listele.countMethod();
		listele.slowFastApproach();
		
	}
}
