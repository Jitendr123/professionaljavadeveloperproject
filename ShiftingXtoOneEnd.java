package Jitendra;

public class ShiftingXtoOneEnd {
	static int count=0;
	static String n="";
	static String sifting(String s,int i) {
		if(i==s.length()) {
			for(int j=0;j<count;j++) {
				n=n+"x";
			}
		return n;	
		}
		
		if(s.charAt(i)!='x') {
			n=n+s.charAt(i)+"";
		}
		else {
			count++;
		}
		sifting(s,i+1);
		return n;
	}
	public static void main(String arg[]) {
		String s="axbcxdxxx";
		String news="";
		String p=sifting(s,0);
		System.out.println(p);
	}

}
