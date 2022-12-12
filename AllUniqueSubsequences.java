package Jitendra;
import java.util.Scanner;
import java.util.HashSet;
public class AllUniqueSubsequences {
	static void allUniqueSubsequeces(String str,int idx,String newString,HashSet<String>set) {
		if(idx==str.length()) {
			if(set.contains(newString)) {
				return;
			}
			else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currChar=str.charAt(idx);
		//to be added
		allUniqueSubsequeces(str,idx+1,currChar+newString,set);
		// not to be added
		allUniqueSubsequeces(str,idx+1,newString,set);
		return;
	}
	// this is my code update
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		int idx=0;
		HashSet<String> set=new HashSet<String>();
		allUniqueSubsequeces(str,0,"",set);
	}

}
