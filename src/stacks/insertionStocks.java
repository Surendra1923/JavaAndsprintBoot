package stacks;
import java.util.*;

public class insertionStocks {
	
	static void reverseStack(Stack<Integer> st) {
		if(st.size()==0)return;
		int top =st.pop();
//		System.out.print(top+ " ");
		reverseStack(st);
		st.push(top);
	}
	static void intsertAtbottom(Stack<Integer> st , int val) {
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		int top = st.pop();
		intsertAtbottom(st,val);
		st.push(top);
		
	}
	static void reverse(Stack<Integer> st) {
		if(st.size()==1) {
			return ;	
		}
		int tio =st.pop();
		reverse(st);
		intsertAtbottom(st,tio);
		
		
	}
	static void removeAtbottom(Stack<Integer> st) {
		Stack<Integer> gt =new Stack<>();
		while(st.size()>1) {
			gt.push(st.pop());
		}
		st.pop();
		while(gt.size()>0) {
			st.push(gt.pop());
		}
	}
	
	static void removefromidx(Stack<Integer> st ,int idx ) {
		
		Stack<Integer> temp =new Stack<>();
		while(st.size()>idx) {
			temp.push(st.pop());
		}
		st.pop();
		while(temp.size()>0) {
			st.push(temp.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Stack<Integer> st =new Stack<>();
		 st.push(10);
		 st.push(20);
		 st.push(30);
		 System.out.println(st);
		 int idx =0;
		 int val=40;
//		 Stack<Integer> temp =new Stack<>();
//		 while(st.size()>idx) {
//			 temp.push(st.pop());
//		 }
//		 temp.push(val);
//		 System.out.println(temp);
//		 while(temp.size()>0) {
//			 st.push(temp.pop());
//		 }
//		 System.out.println(st);
		 
		 
		 reverse(st);
//		 intsertAtbottom(st,100);
//		 removeAtbottom(st);
//		 removefromidx(st,2);
		 System.out.println(st);
		 
		 
		 
		 

	}

}
