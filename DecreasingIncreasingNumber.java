package Jitendra;
import java.util.Scanner;
public class DecreasingIncreasingNumber {
	static void printDecreasingIncreasing(int n) {
		if(n==0) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		printDecreasingIncreasing(n-1);
		System.out.print(n+" ");
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		printDecreasingIncreasing(n);
		
	}
}
