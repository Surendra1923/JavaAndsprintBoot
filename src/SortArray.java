import java.util.Arrays;

public class SortArray {
	
	static void sortArray(int[] arr) {
		int x=-1;
		int y=-1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]>arr[i]) {
				if(x==-1) {
					x= i-1;
					y=i;
				}
				else {
					y=i;
				}
			}
		}
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp; 
		
	}
	static void partition(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			while(arr[l]<0)l++;
			while(arr[r]>0)r--;
			if(l<r) {
				int temp = arr[l];
				arr[l]=arr[r];
				arr[r]= temp;
				l++;
				r--;
			}
		}
	}
	static void sort012(int[] arr) {
		
		int l=0;
		int mid=0;
		int r= arr.length-1;
		while(mid<=r) {
			
			if(arr[mid]==0) {
				int temp =arr[mid];
				arr[mid]=arr[l];
				arr[l]=temp;
				l++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else if(arr[mid]==2) {
				int temp =arr[mid];
				arr[mid]=arr[r];
				arr[r]=temp;
				r--;
			}
		}
	}
	// for the sorted array to find the target value index
	static int searchTarget(int[] arr,int target) {
		
		int l=0;
		int r=arr.length-1;
		while(l<=r){
			
			int mid =l+(r-l)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<arr[r]) {
				if(target>arr[mid] && target<arr[r]) {
					l=mid+1;
				}
				else {
					r=mid-1;
				}
			}
			else {
				if(target>=arr[l] && target<arr[r]) {
					
					r =mid-1;
				}
				else {
					l=mid+1;
				}
			}
			
		}
		return -1;
	}
	// binary seacrh for sorted array with duplicates
	static int search_(int[] arr,int x) {
		
		int st=0;
		int end=arr.length-1; int ans=-1;
		while(st<=end) {
			
			int mid=st+(end-st)/2;
			if(arr[mid]== x)return mid;
			if(arr[mid]==arr[end] && arr[st]==arr[mid]) {
				++st;
				--end;
			}
			else if(arr[mid]<=arr[end]) {  // mid to end is sorted array
				if(x>arr[mid] && x<=arr[end]) {
					st=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else { // st to mid is sorted array
				if(x>=arr[st] && x<arr[mid]) {
					
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
		
		int[] arr= {1,2,3,8,5,6,4,9};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2= {-13,1,2,-7,-1,7,3-12,-3};
		partition(arr2);
		System.out.println(Arrays.toString(arr2));
		int[] arr3= {2,2,1,2,0,0,1,1,2,0,1,2};
		sort012(arr3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4= {2,3,4,5,1};
		int target;
		System.out.println(searchTarget(arr4,target=5));
		int[] arr5= {1,1,1,2,2,3,4,1,1};
		int x =2;
		System.out.println(search_(arr5,x));
		

	}

}
