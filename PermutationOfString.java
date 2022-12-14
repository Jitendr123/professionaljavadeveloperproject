package Jitendra;
import java.util.Scanner;
public class PermutationOfString {
	static void permutation(String str,String arrangement) {
		if(str.length()==0) {
			System.out.println(arrangement);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String currChar=str.charAt(i)+"";//type casting string to char
			String newStr=str.substring(0,i)+str.substring(i+1);//creating new string and removing currchar from str
			permutation(newStr,arrangement+currChar);//p(bc,a)
			
		}
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		permutation(str,"");
	}
}
