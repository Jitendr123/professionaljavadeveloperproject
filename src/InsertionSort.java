import java.util.*;
public class InsertionSort {
    static ArrayList insertionSort(ArrayList<Integer>lis){
        for(int i=1;i<lis.size();i++){
            int current=lis.get(i);
            int j=i-1;
            while(j>=0 && current<lis.get(j)){
                lis.set(j+1,lis.get(j));
                j--;
            }
            lis.set(j+1,current);
        }
        return lis;
    }
    public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<n;i++){
             list.add(sc.nextInt());
         }
         System.out.print(insertionSort(list));
    }
}
