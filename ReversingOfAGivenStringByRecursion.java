package Jitendra;
import java.util.Scanner;
public class ReversingOfAGivenStringByRecursion {
	static String reverseString(String s,int n) {
		if(n==0) {
			String p=s.charAt(n)+"";// conversion of Character in to String
			return p;
		}
		String newString=s.charAt(n)+reverseString(s,n-1);
		return newString;
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String you want to reverse");
		String s=sc.nextLine();
		int n=s.length()-1;
		System.out.println(reverseString(s,n));
	}

}
