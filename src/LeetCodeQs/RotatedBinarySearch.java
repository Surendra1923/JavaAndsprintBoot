package LeetCodeQs;
import java.util.*;

public class RotatedBinarySearch {
	static int serachIndex(int[] arr,int x) {
		int st=0; int end=arr.length-1; int ans=-1;
		
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]<arr[end]) {
				if(x>arr[mid] && x<=arr[end] ) {
					st=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {
				if(x>=arr[st] && x<arr[end]) {
					end=mid-1;
				}
				else {
					st=mid+1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,1,2};
		int x=2;
		System.out.println(serachIndex(arr,x));

	}

}
