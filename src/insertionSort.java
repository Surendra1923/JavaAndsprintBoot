import java.util.*;
public class insertionSort {
	
	static int[] insertionSort(int[] arr) {
		
		int n=arr.length;
		for(int i=1;i<n;i++) {
			
//			int temp= arr[i];
			int j =i;
			while(j>0 && arr[j]<arr[j-1]) {
				
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-9,0,23,-23,8,9};
		System.out.println(Arrays.toString(insertionSort(arr)));

	}

}
