package Jitendra;
import java.util.Scanner;
public class SearchingOfElementTClogn {
	static int search(int arr[],int x) {
		int start=0;
		int end=arr.length;
		while(start<=end) {
			int mid=start+(start+end)/2;
			if(arr[mid]==x) {
				return mid+1;
			}
			else if(x>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of element present in the array");
		int lengthOfArray=sc.nextInt();
		int arr[]=new int [lengthOfArray];
		System.out.println("Enter "+lengthOfArray+" number.");
		for(int i=0;i<lengthOfArray;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to find the index of that element ");
		int element=sc.nextInt();
		System.out.println(search(arr,element));
	}

}
