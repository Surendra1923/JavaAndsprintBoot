package stacks;
import java.util.*;


// reverse and copy 
public class Stacks {
	
	public static void main(String[] args) {
		Stack<Integer> st =new Stack<>();
		st.push(1);
		st.push(23);
		st.push(33);
		st.push(40);
		System.out.println(st);
		System.out.println(st.size());
////		st.pop();
//		System.out.println(st.peek());
//		while(st.size()>3) {
//			st.pop();
//		}
//		System.out.println(st);
		
		
		// reverse 
		
		Stack<Integer> rt =new Stack<>();
		while(st.size()>0) {
			rt.push(st.pop());
		}
//		
		System.out.println(rt);
		
		//copy into new stack
		Stack<Integer> gt =new Stack<>();
		while(rt.size()>0) {
			gt.push(rt.pop());
		}
		System.out.println(gt);
	}

}
