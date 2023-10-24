import java.util.Arrays;

public class Merge {
	
	static void mergeSort(int[] arr,int l,int r) {
		if(l>=r){
			return;
		}
		int mid =(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
		
	}
	static void merge(int[] arr, int l,int mid,int r) {
		
		int n1= mid-l+1;
		int[] left = new int[n1];
		int n2= r-mid;
		int[] right = new int[n2];
		for(int i=0;i<n1;i++)left[i]=arr[l+i];
		for(int j=0;j<n2;j++)right[j]=arr[mid+1+j];
		int i=0;int j=0;int k=l;
		while(i<n1 &&  j<n2) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
			}
		}
		while(i<n1) {
			arr[k++]=left[i++];
		}
		while(j<n2) {
			arr[k++]=right[j++];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,3,5,1,29,0};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}

}
