import java.util.*;
public class RecursiveSum {
//	static int sum=0;
	public static int sumList(ArrayList<Integer> list,int idx) {
		
		if(idx==0)
			return list.get(idx);
		return(list.get(idx)+sumList(list,idx-1));
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<=5;i++) {
			list.add(i);
		}
		
		System.out.print(sumList(list,list.size()-1));
	}
	
	

}
