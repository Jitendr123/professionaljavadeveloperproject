package Jitendra;
import java.util.Arrays;
import java.util.*;
public class InsertionSort {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("total number of element present in the array");
		int n=sc.nextInt();
		System.out.println("enter the number of element you want to sort");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		insertionSort(arr);
		System.out.println("Sorted array is :");
		System.out.println(Arrays.toString(arr));
	}
	public static int[] insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				j--;
			}
		}
		return arr;
	}

}
