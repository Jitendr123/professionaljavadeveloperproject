package Jitendra;
import java.util.*; // contains Collections framework
public class RemovingSpaceFromStringByRecurssion {
	    static String removeSpace(String string,int i,int l,String updatedString){
	        if(i==l){
	        	System.out.println(updatedString);
	            return updatedString;
	        }
	        if(string.charAt(i)!=' '){
	            updatedString=updatedString+string.charAt(i)+"";
//	            removeSpace(string,i++,l,updatedString);
	        }
	        i++;
	        removeSpace(string,i,l,updatedString);
	        return updatedString;
	    }
	    public static void main (String[] args) {
	        // Your code here
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String :");
	        String str=sc.nextLine();
	        int i=0;
	        int l=str.length();
	        String newString="";
	        removeSpace(str,i,l,newString); 
	        
	        
	    }
	}
