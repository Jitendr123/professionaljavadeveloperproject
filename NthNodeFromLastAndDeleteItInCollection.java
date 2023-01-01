package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class NthNodeFromLastAndDeleteItInCollection {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index number ");
		int n=sc.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		list.add("ram");
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ajay");  
		list.add("Anuj");  
		list.add("Gaurav");  
		list.add("Harsh");  
		list.add("Virat");    
		list.add("Amit");
		System.out.println(list);
		System.out.println("size  "+list.size());
		int p=list.size()-n;
		System.out.println(n+" index element from last "+list.get(p));
		list.remove(p);
		System.out.println(list);
	}

}
