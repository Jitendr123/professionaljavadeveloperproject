// Problem Statement
// Morgan Stark asks Peter for help in her HW. She is given an integer n representing the number of pairs of squiggly brackets. Her task is to find the number of all combinations of well- formed(balanced) squiggly brackets.
// Input
// The input contains only a single integer denoting the value of n.

// Constraints:-
// 0 ≤ n ≤ 7
// Output
// Print the number of squiggly brackets.
// Example
// Sample Input:-
// 1

// Sample Output:-
// 1

// Explanation:-
// {}

// Sample Input:-
// 2

// Sample Output:-
// 2

// Explanation:-
// {}{}
// {{}}




// SOLUTION

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static char arr[];
    static int count=0;
    static void generateParents(int pos,int n,int openers,int closers){
        if(pos==arr.length){
            System.out.println(Arrays.toString(arr));
            count++;
            return;
        }
        else {
            if(openers>closers){
                arr[pos]='}';
                generateParents(pos+1,n,openers,closers+1);
            }
            if(openers<n){
                arr[pos]='{';
                generateParents(pos+1,n,openers+1,closers);
            }
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new char[2*n];
        generateParents(0,n,0,0);
        System.out.println(count);
    }
}

