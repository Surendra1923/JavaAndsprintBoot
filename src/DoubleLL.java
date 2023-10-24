
public class DoubleLL {
	
	public static class Node{
		
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	static void display(Node head) {
		Node temp =head;
		while(temp.prev!=null) {
			temp=temp.prev;
		
		}
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
			
		}
		System.out.println();
	}
	// display reverse all linked list  , with tail node
	static void displayrev(Node tail) {
		Node temp =tail;
		while(temp!=null) {
			
			System.out.print(temp.data+" ");
			temp =temp.prev;
		}
		System.out.println();
	}
	//insert at head
	static Node insertAtHead(Node head,int data) {
		Node t =new Node(data);
		t.next=head;
		head.prev=t;
		t.prev=null;
		head=t;
		return head;
		
	}
	// insert at tail
	static void insertAtTail(int data,Node tail) {
		
		Node t=new Node(data);
		tail.next=t;
		t.prev=tail;
		tail=t;
		t.next=null;
	}
	// insert at given index
	static void insertAtidx(Node head,int idx,int data) {
		Node s=head;
		for(int i=1;i<=idx-1;i++) {
			s=s.next;
		}
		Node r=s.next;
		Node temp =new Node(data);
		s.next=temp;
		temp.prev=s;
		temp.next=r;
		r.prev=temp;
	}
	// delete head
	static void deleteHead(Node head) {
//		Node temp=head;
		head=head.next;
		head.prev=null;
		
	}
	// delete at tail
	static void deleteTail(Node tail) {
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail=tail.prev;
		tail.next=null;
	}
	// delete at idx
	static void deleteAtidx(Node head, int idx) {
		Node temp =head;
		for(int i=1;i<idx;i++) {
			temp=temp.next;
		}
		temp =temp.next.next;
		temp.next.prev=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node a=new Node(4);
		Node b=new Node(5);
		Node c =new Node(6);
		Node d =new Node(9);
		
		a.prev=null;
		a.next=b;
		b.prev=a;
		b.next=c;
		c.prev=b;
		c.next=d;
		d.prev=c;
		d.next=null;
		Node newNode=insertAtHead(a,10);
		Node newNode2=insertAtHead(newNode,11);
		Node newNode3=insertAtHead(newNode2,13);
		Node newNode4=insertAtHead(newNode3,14);
//		insertAtTail(12,d);
		display(newNode4);
//		insertAtidx(a,3,45);
//		display(newNode);
		deleteHead(newNode4);
		display(c);
//		displayrev(d);
		deleteTail(d);
		display(newNode4);
		deleteAtidx(newNode4,1);
		display(newNode4);

	}

}
