import java.util.*;
public class ReverseOfStringUsingRecursion {
    static String reverseString(String s,int ind){
        String rev="";
        if(ind==0){
            rev=""+s.charAt(ind);
            return rev;
        }
        rev=s.charAt(ind)+reverseString(s,ind-1)+rev;
        return rev;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String newString=reverseString(s,s.length()-1);
        System.out.print(newString);
    }

}
