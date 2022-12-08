package Jitendra;
import java.util.Scanner;
public class FabonacciSeriesByRecurssion {
	public static void fabonacci(int fn,int sn,int n) {
		if(n==1) {
			System.out.print(fn+sn+" ");
			return;
		}
		int number=fn+sn;
		fn=sn;
		sn=number;
		System.out.print(number+" ");
		fabonacci(fn,sn,n-1);
		return ;
	}
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int fn=1;
	int sn=1;
	int i=1;
	System.out.print(fn+" ");
	System.out.print(sn+" ");
	fabonacci(fn,sn,n-2);
//	System.out.print(f);
	}
}
