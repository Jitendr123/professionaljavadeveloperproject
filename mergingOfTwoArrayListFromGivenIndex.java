package Jitendra;
import java.util.Scanner;
import java.util.ArrayList;
public class mergingOfTwoArrayListFromGivenIndex {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//LENGTH OF FIRST ARRAYLIST
        int m=sc.nextInt();//LENGTH OF SECOND ARRAYLIST
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n;i++){//TAKING INPUT OF FIRST ARRAYLIST
            arr1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){//TAKING INPUT OF SECOND ARRAYLIST
            arr2.add(sc.nextInt());
        }
        int idx=sc.nextInt();//INDEX FROM WHERE WE WANT TO ADD SECOND ARRAYLIST TO FIRST ARRAY LIST
        for(int i=0;i<m;i++){//MERGING OF SECOND ARRAY FROM DESIRED INDEX WITH FIRST ARRAYLIST
            arr1.add(idx+i,arr2.get(i));
        }
         System.out.println(arr1);
    }

}
