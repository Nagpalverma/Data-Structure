package iterator;

import java.util.*;



public class basic {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		
		
		
		Iterator<Integer> b=a.iterator();
		
		while(b.hasNext())
		{
			System.out.println(b.next());
			System.out.println(b.hasNext());
		//	System.out.println(b.next());
		}
		System.out.println();

	}

}
