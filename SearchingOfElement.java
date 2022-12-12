package Jitendra;
import java.util.*;
public class SearchingOfElement {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int lengthOfArray=sc.nextInt();
		int arr[]=new int[lengthOfArray];
		//Taking input of all element in this array 
		System.out.println("Enter "+lengthOfArray+" number to fill tha array");
		for(int i=0;i<lengthOfArray;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number whose position you want to know");
		int num=sc.nextInt();
		boolean s=false; 
		for(int i=0;i<lengthOfArray;i++) {
			if(num==arr[i]) {
				s=true;
				System.out.println(num+" present at the index "+(i+1));
			}
		}
		if(!s) {
			System.out.println(num+" is not present in the given array");
		}
	}
}
