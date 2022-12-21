public class Use1 {
	public static void main(String arg[]) {		
     Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder();
		int n=sc.nextInt();
		while(n>0) {
			int rem=n%8;
			n/=8;
			str.append(rem);
		}
		System.out.println(str.reverse().toString());
  }
}
