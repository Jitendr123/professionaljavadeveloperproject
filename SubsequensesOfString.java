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
//                                     ( )                              ->2^0
//                                      |
//                  (*)                 |             ( )               ->2^1
//                   |                  |                  
//       (*,*)       |      (*, )       |    ( ,*)          ( , )       ->2^2
//         |         |        |         |     / \             /\ 
//         |         |        |         |    /   \           /  \
// (*,*,*) | (*,*, ) | (*, ,*)|(*, , )  |( ,*,*)( ,*, ) ( , ,*)( , ,)   ->2^3  
                                            
// similarly it goes to 2^n  ->so TC(1 + 2^1 + 2^2 + 2^3 + --------- + 2^n) ->  using G.P.  we get 2^(n+1)-1
