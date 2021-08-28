package priority_deque;

import java.util.*;
public class basics {
	
	
	
	
	
	

	public static class b1 implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			//return o2.compareTo(o1);    both are true.
			return -1*o1.compareTo(o2);
		}
		
	}
	
	public static void main(String mmm[])
	{
		b1 aa=new b1();
		
		PriorityQueue<String> a=new PriorityQueue<>(aa);
		a.add("aaaaaa");
		a.add("bbbbb");
		a.add("ksn");
		while(!a.isEmpty())
		System.out.println(a.remove());
		
		
		
		
		
		
		
	}
}
