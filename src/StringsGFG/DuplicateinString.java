package StringsGFG;
import java.util.*;
public class DuplicateinString {
	
	public static void printDuplicates(String str) {
		int n=str.length();
		Map<Character,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(mp.containsKey(str.charAt(i))) {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
				
			}
			else {
				mp.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> mapele:mp.entrySet()) {
			if(mapele.getValue()>1) {
				System.out.println(mapele.getKey()+ ", count : "+mapele.getValue());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I'm Surendra from Kurnool";
		printDuplicates(str);

	}

}
