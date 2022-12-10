package Jitendra;
import java.util.*;
public class SubsequensesOfString {
	static void subsequence(String s,int idx,String newString){
		if(idx==s.length()) {
			System.out.println(newString);
			return;
		}
		char currChar=s.charAt(idx);
		//if current character to be added
		subsequence(s,idx+1,newString+currChar);
		//if current character not to be added
		subsequence(s,idx+1,newString);
		return;
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String you want to find Subsequence");
		String s=sc.nextLine(); 
		subsequence(s,0,"");
	}
}

//TIME COMPLEXCITY
//                                       ( )
//                                        |
//                  (*)                 |             ( ) 
//                   |                  |                 
//       (*,*)       |      (*, )       |    ( ,*)          ( , )
//         |         |        |         |     / \             /\ 
//         |         |        |         |    /   \           /  \
// (*,*,*) | (*,*, ) | (*, ,*)|(*, , )  |( ,*,*)( ,*, ) ( , ,*)( , ,)      
   
()     

