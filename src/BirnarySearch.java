import java.util.Arrays;

public class BirnarySearch {
	
	static boolean birnarySearch(int[] arr,int target) {
		
		int l=0;
		int r=arr.length-1;
//		int mid=(l+r)/2;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==target) {
				return true;
			}
			else if(arr[mid]>target) {
				r=mid-1;
				
			}
			else {
				l=mid+1;
			}
		}
		return false;
		
		
		
	}
	static boolean rebs(int[] arr, int l,int r,int target) {
		
		if(l>r) {
			return false;
		}
		int mid=(l+r)/2;
		if(arr[mid]==target)return true;
		else if(arr[mid]>target) {
			return rebs(arr,l,mid-1,target);
		}
		else {
			return rebs(arr,mid+1,r,target);
		}
	}
	static int firstOccur(int[] arr , int x) {
		int l=0;
		int r=arr.length-1;
		int f0=-1;
		while(l<=r) {
			
			int mid =l+(r-l)/2;
			if(arr[mid]==x) {
				f0=mid;
				r=mid-1;
				
			}
			else if(arr[mid]>x) {
				r= mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return f0;
	}
	// srqt of the number 
	static int sqrt(int x) {
		int st=0;
		int end=x;
		int ans =-1;
		while(st<=end) {
			
			int mid =st + (end-st)/2;
			int val =mid*mid;
			if(val==x)return mid;
			else if(val<x) {
				ans =mid;
				st=mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		return ans;
	}
	// find the mix idx of the rotated sorted array
	static int minrotatedArray(int[] arr) {
		int n= arr.length;
		int st=0;
		int end=n-1;
		int ans=-1;
		while(st<=end) {
			int mid =st+(end-st)/2;
			if(arr[mid]<=arr[n-1]) {
				ans=mid;
				end=mid-1;
				
			}
			else {
				st =mid+1;
			}
		}
		return ans;
	}
	//
	static boolean isDivsionPossible(int[] a, int m, int mxchocAllowed) {
		
		int numofstu=1;
		int choc =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>mxchocAllowed)return false;
			if(choc+a[i]<=mxchocAllowed) {
				choc+=a[i];
				
			}
			else {
				numofstu++;
				choc=a[i];
			}
		}
		if(numofstu>m)return false;
		return true;
	}
	//distrubute chocolates 
	
	static int distributeChocolate(int[] a, int m) {
		
		if(a.length<m) return -1;
		int ans=0;
		int st=1;int end=(int)1e9;
		while(st<=end) {
			
			int mid =st+(end-st)/2;
			
			if(isDivsionPossible(a,m,mid)) {
				ans =mid;
				end=mid-1;
				
			}
			else {
				st=mid+1;
			}
		}
		return ans;
	}
	
	// racing track , isPossible method
	static boolean isPossible(int[] a, int k, int dist) {
		
		int kidsplaced=1;
		int lastkid =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]-lastkid>=dist) {
				kidsplaced++;
				lastkid=a[i];
			}
			
		}
		return kidsplaced>=k;
	}
	//racing track
	static int raceTrack(int[] a,int k) {
		if(k>a.length)return -1;
		int st=0; int end=(int)1e9;
		int ans=0;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(isPossible(a,k,mid)) {
				ans =mid;
				st=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int target =4;
		boolean res= birnarySearch(arr,target);
		boolean res2=rebs(arr,0,arr.length-1,target);
		if(res2) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		int[] arr2= {0,0,0,1,2,3,4};
		int x =1;
		System.out.println(firstOccur(arr2,x));
		int n=26;
		System.out.println(sqrt(n));
		int[] arr3= {3,4,5,6,1,2};
		System.out.println(minrotatedArray(arr3));
		
		int[] arr4= {12,34,67,90};
		int m =2;
		System.out.println(distributeChocolate(arr4,m));
		
		// racing track
		int[] arr5= {1,2,4,8,9};
		int k=2;
		System.out.println(raceTrack(arr5,k));

	}

}
