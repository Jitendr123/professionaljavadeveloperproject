// Problem Statement
// Given an integer array A of size N. Find the sum of GCD (Greatest Common Divisor) of all elements with their frequency.
// Input
// First line contains an integers N.
// Next line contains N space separated integers denoting elements of array.

// Constraints
// 1 <= N <= 1000
// 0 <= Ai<= 10^5
// Output
// Print the sum of GCD of all elements with their frequency.
// Example
// Sample Input 1:
// 3
// 1 2 3

// Output
// 3

// Explanation:
// gcd(1, 1) + gcd(2, 1) + gcd(3, 1) = 1+1+1 = 3

// Sample Input 2:
// 6
// 3 6 6 9 3 3

// Output
// 14

// Explanation
// gcd(3, 3) + gcd(6, 2) + gcd(6, 2) + gcd(9, 1) + gcd(3, 3) + gcd(3, 3)= 3+2+2+1+3+3= 14


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter total number :");
        int arr[]=new int [n];
        System.out.println("enter all number separated by comma :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fre[]=findFreq(arr);
        System.out.println("frequency array is :"+Arrays.toString(fre));
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+gcd(arr[i],fre[i]);
        }
        System.out.println("sum of the GCD of two number is:"+sum);
    }
  //GCD of two number
    static int gcd(int a,int b){
        if(b>a){
            while(b%a!=0){
                int c=a;
                a=b%a;
                b=c;
            }
            return a;
        }
        else{
            while(a%b!=0){
                int c=b;
                b=a%b;
                a=c;
            }
            return b;
        }
    }
  // counting the frequency array
    static int[] findFreq(int arr[]){
        int fre[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            fre[i]=count;
        }
        return fre;
    }
}



