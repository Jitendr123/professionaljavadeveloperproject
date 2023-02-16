package collections.stack;
import java.util.*;
import java.util.Stack;
public class EvaluateExpressionUsingStack {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		String newItem=sc.next();
		if(!isOperator(newItem)) {
			s.push(Integer.parseInt(newItem+""));
		}
		else {
			int val1=s.pop();
			int val2=s.pop();
			s.push(resultAfterOperation(val2,val1,newItem));	
		}
		}
		System.out.println(s.peek());
	}
	
	//------------------------------------------------------------------
	public static boolean isOperator(String c) {
		if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")) {
			return true;
		}
		else {
		return false;
		}
	}
	
	//-------------------------------------------------------------------
	public static int resultAfterOperation(int a,int b,String newItem) {
		int c=0;
		switch(newItem) {
		case "+": 
			    c= (a+b);
			    break;
		case "-": 
			    c= (a-b);
			    break;
		case "*": 
			    c= (a*b);
			    break;
		case "/": 
			    c= (a/b);
			    break;
		}
		return c;
	}
    //-------------------------------------------------------------------
}
