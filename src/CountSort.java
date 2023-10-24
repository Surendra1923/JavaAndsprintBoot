import java.util.*;
public class CountSort {
	// to find the mx in arr
	static int findmx(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mx) {
				mx=arr[i];
			}
		}
		return mx;
	}
	
	// count sort
	static void CountSort(int[] arr) {
		
		int max= findmx(arr);
		
		int[] count = new int[max+1];
		int n=arr.length;
		int[] output=new int[n];
		// to make a frequency array
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		// make prefix sum array of count array
		
		for(int i=1;i<count.length;i++) {
			
			count[i]+=count[i-1];
		}
		// find the index of each ele in the orginal array
		
		for(int i=n-1;i>=0;i--) {
			
			int idx = count[arr[i]]-1;
			output[idx]=arr[i];
			count[arr[i]]--;
		}
		//copy all ele from output array to array
		for(int i=0;i<n;i++) {
			arr[i]=output[i];
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before count sort : "+ Arrays.toString(arr));
		// to imple count sort 
		CountSort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
