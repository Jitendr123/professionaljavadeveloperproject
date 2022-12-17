package Jitendra;
import java.util.*;
public class PrimeFactor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n; ) {
			if(n%i==0) {
	        System.out.print(i+" ");
	        n=n/i;
	        
			}
			else {
				i++;
			}
		}
	}
		
	

}
