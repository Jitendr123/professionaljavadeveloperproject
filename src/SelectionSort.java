import java.util.*;
public class SelectionSort {
    static ArrayList selectionSort(ArrayList<Integer> lis,int length){
        for(int j=0;j<length-1;j++) {
            int smallest=j;
            for (int i = j+1; i < length; i++) {
                if(lis.get(smallest) > lis.get(i)){
                    smallest=i;
                }
            }
            int temp=lis.get(j);
            lis.set(j,lis.get(smallest));
            lis.set(smallest,temp);
//            System.out.println(list);
        }
        return lis;
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

//        for(int j=0;j<n-1;j++) {
//            int smallest=j;
//            for (int i = j; i < n; i++) {
//                if(list.get(smallest)>list.get(i)){
//                    smallest=i;
//                }
//            }
//            int temp=list.get(j);
//            list.set(j,list.get(smallest));
//            list.set(smallest,temp);
////            System.out.println(list);
//        }
        System.out.println(selectionSort(list,n));
    }
}
