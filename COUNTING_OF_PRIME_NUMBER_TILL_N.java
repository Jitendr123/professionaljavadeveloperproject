// Problem Statement
// In School Megha was given a homework to find the number of prime numbers before N (Including that number too), since Megha is weak in Maths she needs your help to do her homework.
// Input
// The first line of the input contains the number of testcases T,
// Next T lines contains the value N.

// Constraints
// 1 <= T <= 1e5
// 1 <= N <= 1e5
// Output
// Print the number of primes number before that number.
// Example
// Sample Input 1:
// 2
// 3
// 11

// Sample Output 1:
// 2
// 5




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int[] primeTillN(int n){
		boolean arr[]=new boolean[n+1];
		int  primecount[]=new int[n+1];
		primecount[0]=0;
		primecount[1]=0;
		int count=0;
		for(int i=2;i<n+1;i++){
			if(arr[i]==false){
				count++;
				primecount[i]=count;
				for(int j=i;j<n+1;j=j+i){
					arr[j]=true;
				}
			}
		 }
		// System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(primecount));
		return primecount;
	}
    public static void main (String[] args) {
		int primecounted[]=primeTillN(100000);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			int t=sc.nextInt();
			if(t==1||t==0){
					t=0;
				}
			else while(primecounted[t]==0){
				t--;
			}
			System.out.println(primecounted[t]);
		}
   }
}




