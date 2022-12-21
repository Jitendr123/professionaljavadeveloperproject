import java.util.*;
public class QuickSort {	
public static void main(String arg[]) {
		int arr[]= {9,4,7,2,8,3};
		int n=arr.length;
		quickSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int arr[],int left,int right) {
		if(left<right) {
			int pidx=partition(arr,left,right);
			quickSort(arr,left,pidx-1);
			quickSort(arr,pidx+1,right);
		}
	}
	public static int partition(int arr[],int left,int right) {
		int pivot=arr[right];
		int i=left-1;
		for(int j=left;j<right;j++){
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[right]=temp;
		return i;
	}
}
