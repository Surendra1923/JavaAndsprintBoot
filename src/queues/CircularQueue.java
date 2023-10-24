package queues;

public class CircularQueue {
	
	public static class CPA{
		
		int front =-1;
		int rear=-1;
		int size=0;
		int[] arr =new int[8];
		
		public void add(int val) throws Exception {
			if(size==arr.length) {
				throw new Exception("Q is full");
			}
			else if(size==0) {
				front=rear=0;
				arr[0]=val;
			}
			else if(rear<arr.length-1) {
				arr[++rear]=val;
				
			}
			else if(rear==arr.length-1) {
				rear=0;
				arr[0]=val;
			}
			size++;
		}
		
		public int remove() throws Exception {
			if(size==0) {
				throw new Exception("Q is empty");
			}
			else {
				int val=arr[front];
				if(front==arr.length-1)front=0;
				else front++;
				size--;
				return val;
				
			}
			
		}
		public int peek() throws Exception{
			if(size==0) {
				throw new Exception("q is empty");
			}
			return arr[front];
			
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CPA cpa=new CPA();
		cpa.add(10);
		cpa.add(20);
		cpa.add(30);
		System.out.println(cpa.remove());
		System.out.println(cpa.peek());

	}

}
