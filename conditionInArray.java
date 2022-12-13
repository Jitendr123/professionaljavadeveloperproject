import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
    static int fac(int i,int j){
        if(i==0){
            return 1;
        }
        fac(i-1,j);
        j=j*i;
        return j;
    }
    static boolean givenCondition(int arr[]){
        boolean p=false;
        for(int i=0;i<arr.length;i++){
            int j=fac(i,1);
            if(j>arr.length){
                break;
            }

            else if(arr[i]==2*arr[j]){
                p=true;
            }
        }
        return p;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int lengthOfArray=sc.nextInt();
        int arr[]=new int [lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){
            arr[i]=sc.nextInt();
        }
        if(givenCondition(arr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
