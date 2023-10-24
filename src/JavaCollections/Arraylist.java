package JavaCollections;

import java.util.*;

public class Arraylist {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"Suri","Sam","priya"};
		ArrayList al2=new ArrayList(Arrays.asList(arr));
		System.out.println(al2);
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(12.3);
		al.add("Surendra");
		al.add("Ture");
//		System.out.println(al);
		for(Object o:al) {
			System.out.println(o);
		}
		
		// using iterator 
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
