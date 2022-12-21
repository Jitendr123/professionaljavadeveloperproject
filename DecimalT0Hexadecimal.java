public class Use1 {
	public static void main(String arg[]) {		
     Scanner sc=new Scanner(System.in);
        String s="";
        char arr[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int n=sc.nextInt();
        while(n>0) {
        	int rem=n%16;
        	n/=16;
        	s=arr[rem]+s;
        }
        System.out.println(s);	
	}
}
