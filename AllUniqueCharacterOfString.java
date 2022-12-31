package Jitendra;
import java.util.*;
public class AllUniqueCharacterOfString {
	static void uniqueCharacter(String s,int i,HashSet<Character>set) {
		if(i==s.length()) {
			System.out.print(set);
			return;
		}
		if(!set.contains(s.charAt(i))) {
			set.add(s.charAt(i)); 
		}
		uniqueCharacter(s,i+1,set);
		return;
	}
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	HashSet<Character>set=new HashSet<>();
	uniqueCharacter(s,0,set);
	
	}
}
