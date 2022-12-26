// Problem Statement
// Chinmay went to meet Bunty with 2x2 sweet because Bunty is a sweet child, and he saw Bunty playing with a right-angled isosceles triangle with base B. Chinmay came up with an intriguing notion and challenged Bunty to solve it; if he succeeds, he will be rewarded. Since Chinmay only purchased 'x' amount of sweets, he requests the greatest number of sweets that can fit in the triangle he's playing, with one side of the sweet parallel to the triangle's base.
// Note: The base is the triangle's shortest side.
// Input
// The first line includes a space between "X" as the quantity of sweet Chinmay purchased and "B" as the base of the triangle.

// Constraints:
// 1≤ B ≤ 104
// 1≤ X ≤ 109
// Output
// Output the maximum number of sweet he can able to fit in the triangle.
// Example
// Sample Input:
// 5 4
// Sample Output:
// 1
// Explanation:
// In the triangle with base 4, Bunty can able to fit only one sweet in it.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=sc.nextInt();
        int lastRow=(b-2)/2;
        int sum=(lastRow*(lastRow+1))/2;
        if(sum<=x){
            System.out.println(sum);
        }
        else{
            System.out.println(x);
        }
    }


