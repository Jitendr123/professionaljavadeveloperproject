package collections;
import java.util.*;
public class PushAelementInNBottom {
	static void pushAtBottom(int data,Stack<Integer>s) {;
	if(s.isEmpty()) {
		s.push(data);
		return;
	}
	int top=s.pop();
	pushAtBottom(data,s);
	s.push(top);
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Stack<Integer>s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		pushAtBottom(data,s);
		System.out.println(s);
	}

}
