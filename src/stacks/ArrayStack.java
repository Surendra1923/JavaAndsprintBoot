package stacks;

public class ArrayStack {
	
	public static class Stack{
		private int[] arr=new int[5];
		private int idx=0;
		
		
		// push 
		void push(int val) {
			arr[idx]=val;
			idx++;
		}
		
		// peek method
		
		int peek() {
			
			if(idx==0) {
				System.out.println("Stack is empty");
				return -1;
			}
			return arr[idx-1];
		}
		
		// pop 
		int pop() {
			if(idx==0) {
				System.out.println("Stack is empty");
				return -1;
			}
			int top =arr[idx-1];
			arr[idx-1]=0;
			idx--;
			return top;
		}
		
		void display() {
			for(int i=0;i<idx;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		int size() {
			return idx;
		}
	}
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop();
		st.display();
		
		System.out.println(st.peek());
		System.out.println(st.size());
		
		
	}

}
