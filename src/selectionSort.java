import java.util.*;

public class selectionSort {
	
	static int[] selection_sort(int[] arr) {
		
		int n=arr.length;
		
		for (int i=0;i<n;i++) {
			
			int min_idx = i;
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[min_idx]) {
					min_idx= j;
				}
			}
			if (i!=min_idx){
				
				int emp= arr[i];
				arr[i]= arr[min_idx];
				arr[min_idx]=emp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] arr= {9,7,0,3,1,6};
		System.out.println(Arrays.toString(selection_sort(arr)));
	}

}
