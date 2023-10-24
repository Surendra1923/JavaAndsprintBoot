import java.util.Arrays;

public class QuickSort {
	
	static void swap(int[] arr,int idx1,int idx2) {
		int temp =arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
	}
	static int pivot(int[] arr,int pivot_idx,int  end_idx) {
		
		int swap_idx =pivot_idx;
		for(int i=pivot_idx+1;i<end_idx+1;i++) {
			
			if(arr[i]<arr[pivot_idx]) {
				swap_idx++;
				swap(arr,swap_idx,i);
			}
			
		}
		swap(arr,pivot_idx,swap_idx);
		return swap_idx;
	}
	static int[] quickSort(int[] arr,int left,int right) {
		
		if (left<right) {
			
			int pivot_idx =pivot(arr,left,right);
			quickSort(arr,left,pivot_idx-1);
			quickSort(arr,pivot_idx+1,right);
		}
		return arr;
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {8,0,5,3,45,89};
		int[]arr2=quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr2));

	}

}
