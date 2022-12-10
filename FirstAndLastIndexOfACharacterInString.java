package Jitendra;
import java.util.*;
public class FirstAndLastIndexOfACharacterInString {
	public static int f=-1;
	public static int l=-1;
	public static void recursion(String s,char c,int i,int j) {
		if(f!=-1 && l!=-1) {
			System.out.println("first index of character '"+c+"' is :"+f );
			System.out.println("last index of character '"+c+"' is :"+(l+1) );
			return;
		}
		if(s.charAt(i)==c) {
			if(f==-1) {
				f=i;
			}
		}
		if(s.charAt(j)==c) {
			if(l==-1) {
				l=j;
			}
		}
		recursion(s,c,i+1,j-1);
		return;
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		int first=0;
		int last=s.length()-1;
		recursion(s,c,first,last);
	}

}
