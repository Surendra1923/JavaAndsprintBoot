
public class CircularLL {
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	static void display(Node head) {
		Node temp=head;
		do {
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}while(temp!=head);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		a.next=b;
		a.prev=d;
		b.prev=a;
		b.next=c;
		c.prev=b;
		c.next=d;
		d.next=a;
		d.prev=c;
		display(a);
		
		

	}

}
