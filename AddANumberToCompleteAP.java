package Jitendra;
import java.util.*;
public class AddMissingNumberToCompleteAP {
	static ArrayList<Integer> missingNumber(ArrayList<Integer>list,int cd){
		for(int i=0;i<list.size()-1;i++){
            if((list.get(i+1)-list.get(i))==(list.get(i+2)-list.get(i+1))){
                cd=list.get(i+1)-list.get(i);
                break;
            }
            else if((list.get(i+2)-list.get(i+1))==(list.get(i+3)-list.get(i+2))){
                cd=list.get(i+2)-list.get(i+1);
                break;
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(cd!=(list.get(i+1)-list.get(i))){
                 list.add(i+1,(list.get(i)+cd));
                
            }
        }
		return list;
	}
	    public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter total number of element present in the A.P.");
	        int lengthOfArrayList=sc.nextInt();
	        ArrayList<Integer>list=new ArrayList<>();
	        System.out.println("Enter numbers that are presents in the A.P.");
	        for(int i=0;i<lengthOfArrayList;i++){
	            list.add(sc.nextInt());
	        }
	        int cd=0;
	        missingNumber(list,cd);
	         System.out.print(list);
	    }
	}
