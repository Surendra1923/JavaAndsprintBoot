package queues;
import java.util.*;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.add(10);	q.add(20); q.add(30);q.add(40);
		System.out.println(q);
		
		Stack<Integer> st =new Stack<>();
		while(q.size()>0) {
			st.push(q.remove());
		}
		while(st.size()>0) {
			q.add(st.pop());
		}
		System.out.println(q);

	}

}
