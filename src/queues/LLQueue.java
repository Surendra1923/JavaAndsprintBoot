package queues;

public class LLQueue {
	
	public static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val=val;
		}
		
	}
	public static class LLQueueImp{
		
		Node head=null;
		Node tail =null;
		int size=0;
		
		public void add(int val) {
			Node temp =new Node(val);
			if(size==0) {
				head=tail=temp;
				
			}
			tail.next=temp;
			tail =temp;
			size++;
		}
		public int peek() {
			if(size==0) {
				System.out.println("q is empthy");
				return -1;
			}
			return head.val;
		}
		public int remove() {
			if(size==0) {
				System.out.println("q is empty");
			}
			int x=head.val;
			head=head.next;
			size--;
			return x;
		}
		public void display() {
			Node temp =head;
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp =temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLQueueImp q= new LLQueueImp();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.display();
		System.out.println("REMVOE ");
		
		for(int i=0;i<5;i++) {
			System.out.print(q.remove()+" ");
		}
		

	}

}
