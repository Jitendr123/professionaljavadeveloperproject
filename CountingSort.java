package Jitendra;
import java.util.*;
public class CountingSort {
	public static void main(String arg[]) {
		int arr[]= {2,5,1,9,3,6,3,8,9,2,4,6,3,9,5,7,4,3};
		int n=arr.length;
		int maxValue=max(arr,n-1);
		System.out.println(Arrays.toString(arr)+" given array");
		System.out.println(maxValue+" length of array");
		int countingArray[]=countArray(arr,maxValue);
		System.out.println(Arrays.toString(countingArray)+" counting array");
		int commulativeFrequency[]=commulativeFrequency(countingArray);
		System.out.println(Arrays.toString(commulativeFrequency)+" commulative frequency array");
		int sortedArray[]=sortedArray(arr,n-1,commulativeFrequency);
		System.out.println(Arrays.toString(sortedArray)+" sortedArray");
		
	}
	public static int[]sortedArray(int arr[],int n,int commArray[]){
		int newarr[]=new int[arr.length];
		while(n>=0) {
			newarr[commArray[arr[n]]-1]=arr[n];
			commArray[arr[n]]=commArray[arr[n]]-1;
			n--;
		}
		return newarr;
	}
	public static int[]commulativeFrequency(int arr[]){
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
		return arr;
	}
	public static int[] countArray(int arr[],int n) {
		int arr1[]=new int[n+1];
		for(int i=0;i<n;i++) {
			arr1[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			arr1[arr[i]]=arr1[arr[i]]+1;
		}
		return arr1;
	}
	public static int max(int arr[],int n) { 
		int maxx=arr[0];
		for(int i=1;i<n;i++) {
			if(maxx<arr[i]) {
				maxx=arr[i];
			}
		}
		return maxx;
	}

}
