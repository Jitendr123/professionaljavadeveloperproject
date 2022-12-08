package Jitendra;
import java.util.*;
public class PalindronByRecurssion {
	static boolean isPalindron(String str,int s,int l) {
		if(s>=l) {
			return true;
		}
		if(str.charAt(s)==str.charAt(l)) {
			return isPalindron(str,s+1,l-1);
		}
		else {return false;}
	}
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in); 
	String s=sc.nextLine();
	int startIdx=0;
	int lastIdx=s.length()-1;
	System.out.print(isPalindron(s,startIdx,lastIdx));
	}
}
