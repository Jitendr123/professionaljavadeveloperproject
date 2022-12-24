package Jitendra;
import java.util.Scanner;
public class GCDbyRecursion{
	static int gcd=1;
	static void GCD(int a,int b,int gcd) {
		if(b%gcd==0) {
			System.out.print("Hence: GCD is "+gcd+".");
			return;
		}
		System.out.print("when "+b+" is devided by "+a+ " remainder is ");
		gcd=b%a;
		b=a;
		a=gcd;
		System.out.println(gcd+".");
		GCD(a,b,gcd);
		return ;
	}
    public static void main(String arg[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter any number,Whose Greates Common Diviser you want: ");
    	int m=sc.nextInt();
    	int n=sc.nextInt();
    	int small=(m<n)?m:n;
    	int gcd=small;
    	int large=(m>n)?m:n;
    	System.out.println("-----------------------");
    	GCD(small,large,gcd);
}
}




EASY WAY TO SOLVE IT
int x = sc.nextInt();
   int y = sc.nextInt();
   System.out.println(gcd(x, y));
    }
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }





















