import java.util.*;
public class bobbleSort {
	
	static int[] bobbleSort(int[] arr) {
		
		int n =arr.length;
		for(int i=n-1;i>=0;i--) {
			
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] arr= {0,66,12,34,45};
		int[] anb=bobbleSort(arr);
		System.out.println(Arrays.toString(anb));
	}
		

}
