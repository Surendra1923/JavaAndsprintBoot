package queues;

public class BasicQueue {
	
	public static class ArrayQueue{
		private int[] arr= new int[5];
		private int f=-1;
		private int r=-1;
		
		int size=0;
		
		void push(int val) {
			if(r==arr.length-1) {
				System.out.println("Q is full");
			}
			if(f==-1) {
				f=r=0;
				arr[0]=val;
			}
			else {
				arr[++r]=val;
				
			}
			size++;
		}
		void display() {
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		int remove() {
			if(size==0) {
				System.out.println("Q is empty"); 
				return -1;
			}
			f++;
			size--;
			return arr[f-1];
			
		}
		
		int peek() {
			return arr[f];
		}
	}

	public static void main(String[] args) {
		
		ArrayQueue q= new ArrayQueue();
		q.push(10);
		q.push(20);	
//		q.display();
//		q.remove();
//		q.display();
		q.push(30);
		q.push(40);
		q.display();
		
		System.out.println("REMOVE ORDER");
		for(int i=0;i<4;i++) {
			System.out.println(q.remove());
			
		}
		// TODO Auto-generated method stub

	}

}
