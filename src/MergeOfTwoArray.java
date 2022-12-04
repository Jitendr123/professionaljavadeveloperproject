import java.util.*;

public class MergeOfTwoArray {
    public static void main(String arg[]){
//        merging of two array and removing duplicate array
        int []array1={1,2,3,4,5,5,6,7};
        int[] array2={6,7,8,9,9,10};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<array1.length;i++){
            list.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            list.add(array2[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(i);
            }
        }
        System.out.print(list);
    }

}
