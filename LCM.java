// Problem Statement
// Given an integer N. Find the smallest positive number that is evenly divisible by all numbers between 1 to N(inclusive).
// Input
// Only line will contain N.

// Constraints
// 1 ≤ N ≤ 1000
// Output
// A single integer denoting the answer.
// Example
// Input:
// 6

// Output:
// 60

// Explanation:
// No other number smaller than 60 is divisible by all {1, 2, 3, 4, 5, 6}.

// SOLUTION

import java.util.*; // contains Collections framework
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a number up to you want to find the LCM");
        int n=sc.nextInt();
        int number=n*(n-1);
        int m=n-2;
        while(m>0){
          //LCM=(a*b)/HCF
            number=(number*m)/gcd(m,number);
            m--;
        }
      //LCM OUTPUT
        System.out.println(number);
    } 
  //RETURN HCF OF TWO NUMBER
    static int gcd(int i,int n){
        int p=i;
        while(n%i!=0){
            int k=i;
            i=n%i;
            n=k;
        }
        return i;
    }
}
