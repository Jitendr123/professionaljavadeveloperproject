package Jitendra;
import java.util.*;
//public class TowerOfHanoi {
//	static void  siftingOfIstElement(int n,ArrayList<Integer> Source,ArrayList<Integer> Helper,ArrayList<Integer> Desti) {
//		if(n==0) {
//			return;
//		}
//		else if(Source.size()%2==0) {
//			Helper.add(Source.get(Source.size()-1));
//			Desti.add(Source.get(Source.size()-2));
//			Source.remove(Source.size()-1);
//			Source.remove(Source.size()-1);
//			System.out.println("SOURCE"+Source);
//			System.out.println("HELPER"+Helper);
//			System.out.println("DESTINATION"+Desti);
//			System.out.println("-----------------------------------------------");
//		}
//		else {
//		    Desti.add(Source.get(Source.size()-1));
//			Helper.add(Source.get(Source.size()-2));
//			Source.remove(Source.size()-1);
//			Source.remove(Source.size()-1);
//			System.out.println("SOURCE"+Source);
//			System.out.println("HELPER"+Helper);
//			System.out.println("DESTINATION"+Desti);
//			System.out.println("-----------------------------------------------");
//		}
//	}
//	static void  towersArrangement(int n,ArrayList<Integer> s,ArrayList<Integer> h,ArrayList<Integer> d,ArrayList<Integer>f) {
//		if(d.equals(f)) {
//			return ;
//		}
//		if(d.get(d.size()-1)<h.get(h.size()-1)) {
//			h.add(d.get(d.size()-1));
//			d.remove(d.size()-1);
//			System.out.println("SOURCE"+s);
//			System.out.println("HELPER"+h);
//			System.out.println("DESTINATION"+d);
//			System.out.println("-----------------------------------------------");
//		}
//		else {
//			d.add(h.get(h.size()-1));
//			h.remove(h.size()-1);
//			System.out.println("SOURCE"+s);
//			System.out.println("HELPER"+h);
//			System.out.println("DESTINATION"+d);
//			System.out.println("-----------------------------------------------");
//		}
////		towersArrangement(n, s,h,d,f);
//		ArrayList<Integer>p=Collections.sort(d);
//		if(d.equlas(Collections.sort(d))) {
//			
//		}
//		siftingOfIstElement( n-2, s, h, d);
//		towersArrangement(n, s,h,d,f);
//		return;
//		
//	}
//	
//	public static void main(String arg[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of disc present in the hanoi tower");
//		int n=sc.nextInt();
//		ArrayList<Integer>Source=new ArrayList<>();
//		ArrayList<Integer>Helper=new ArrayList<>();
//		ArrayList<Integer>Desti=new ArrayList<>();
//		ArrayList<Integer>FinalArrayList=new ArrayList<>();
//		for(int i=n;i>0;i--) {
//			Source.add(i);
//		}
//		FinalArrayList=Source;
//		System.out.println("SOURCE"+Source);
//		System.out.println("HELPER"+Helper);
//		System.out.println("DESTINATION"+Desti);
//		
//		System.out.println("-----------------------------------------------");
//		siftingOfIstElement(n,Source,Helper,Desti);
//		towersArrangement(n-2,Source,Helper,Desti,FinalArrayList);
//	}
//
//}

//public class TowerOfHanoi{
//	static void toh(int n,ArrayList<Integer>s,ArrayList<Integer>h,ArrayList<Integer>d) {
//		if(s.size()==0 && h.size()==0) {
//			return;
//		}
////		toh(n-1,s,d,h );
//		d.add(s.get(s.size()-1));
//		s.remove(s.size()-1);
//		h.add(s.get(s.size()-1));
//		s.remove(s.size()-1);
//		System.out.println("Source      : "+s);
//		System.out.println("Helper      : "+h);
//		System.out.println("Destination : "+d);
//		System.out.println("-----------------------------------");
////		h.add(s.get(s.size()-1));
////		s.remove(s.size()-1);
////		System.out.println("Source      : "+s);
////		System.out.println("Helper      : "+h);
////		System.out.println("Destination : "+d);
////		System.out.println("-----------------------------------");
//		toh(n-2,h,d,s);
//		return;
//	}
//	public static void main(String arg[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter how many disks present in the source  tower");
//		int disk=sc.nextInt();
//		ArrayList<Integer> source=new ArrayList<>();
//		ArrayList<Integer> helper=new ArrayList<>();
//		ArrayList<Integer> desti=new ArrayList<>();
//		System.out.println("Here bigger number mean bigger disk");
//		for(int i=disk;i>0;i--) {
//			source.add(i);
//		}
//		System.out.println("Source      : "+source);
//		System.out.println("Helper      : "+helper);
//		System.out.println("Destination : "+desti);
//		System.out.println("-----------------------------------");
//		toh(disk,source,helper,desti);
//	}
//	
//}


//public class TowerOfHanoi{
//	public static void toh(int n,String src,String helper,String dest) {
//		if(n==1) {
//			System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//			return;
//	}
//		toh(n-1,src,dest,helper);
//		System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//		toh(n-1,helper,src,dest);
//    }
//	public static void main(String arg[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of disk :");
//		int n=sc.nextInt();
//		toh(n,"S","H","D");
//	}
//}


public class TowerOfHanoi{
	public static void toh(int n,ArrayList<Integer>src,ArrayList<Integer>helper,ArrayList<Integer>dest) {
		if(n==1) {
			System.out.println("transfer disk "+n+" from "+src+" to "+dest);
			return;
	    }
		
		toh(n-1,src,dest,helper);
		System.out.println("transfer disk "+n+" from "+src+" to "+dest);
		toh(n-1,helper,src,dest);
    }
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of disk :");
		int n=sc.nextInt();
		ArrayList<Integer>S=new ArrayList<Integer>();
		ArrayList<Integer>H=new ArrayList<Integer>();
		ArrayList<Integer>D=new ArrayList<Integer>();
		for(int i=n;i>0;i++) {
			S.add(i);
		}
		toh(n,S,H,D);
	}
}




