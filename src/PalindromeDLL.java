
public class PalindromeDLL {
	
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
		
	}
	static boolean PallindromeLL(Node head,Node tail) {
		Node h=head;
		Node t=tail;
		while(h!=t) {
			if(h.data==t.data) return true;
			h=h.next;
			t=t.prev;
		}
		return false;
//		System.out.println("False");/
	}
	// find the two of sum is equal to the target sum
	static boolean sumofTwoLL(Node head,Node tail,int target) {
		Node h=head;
		Node t=tail;
		while(h!=t) {
			
			if(h.data+t.data==target)return true;
			if(h.data+t.data>target)t=t.prev;
			else if(h.data+t.data<target)h=h.next;
			
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(20);
		Node n4=new Node(40);
		Node n5=new Node(50);
		n1.next=n2; 
		n1.prev=null;
		n2.next=n3;
		n2.prev=n1;
		n3.next=n4;
		n3.prev=n2;
		n4.prev=n3;
		n4.next=n5;
		n5.prev=n4;
		n5.next=null;
//		boolean flag=PallindromeLL(n1,n3);
//		System.out.println(flag);
		
		int target=10;
		boolean flag2= sumofTwoLL(n1,n5,target);
		System.out.println(flag2);
		
		  

	}

}
