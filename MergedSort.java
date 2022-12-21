package Jitendra;
import java.util.*;
public class MergedSort {
	public static void main(String[] args) {
		int arr[]= {9,6,8,3,7,2,4};
		int n=arr.length;
		System.out.println("Given array"+Arrays.toString(arr));
		divide(arr,0,n-1);
		System.out.println("finally sorted array"+Arrays.toString(arr));
	}
	public static void divide(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		//dividing the given array in two part
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		//adding two divided array 
		conquer(arr,si,mid,ei);
	}
	public static void conquer(int arr[],int si,int mid,int ei) {
		//new array list where we put our sorted array
		int merged[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		// filling the smaller element from both half array in to merged array
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x]=arr[idx1];
				x++;idx1++;
			}
			else {
				merged[x]=arr[idx2];
				x++;idx2++;
			}
		}
		// filling remaining element in to merged array 
		while(idx1<=mid) {
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=arr[idx2++];
		}
		//filling merged array element in to given array
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}

}
