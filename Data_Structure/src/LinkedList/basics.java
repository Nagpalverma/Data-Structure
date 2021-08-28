package LinkedList;
import java.util.*;
public class basics {

	public static void main(String[] args) {
		List<Integer> no=new LinkedList<>();
		List<Integer> no1=new LinkedList<>();
		no.add(5);
		no.add(1);
		no.add(9);
		no.add(7);
		no.add(8);
		no.add(4);
		
		no1.add(9);
		no1.add(4);
		no1.add(9);
		no1.add(5);
		no1.add(6);
		no1.add(0);
		
		System.out.println(no);
		no.add(2,5);
		System.out.println(no);
		no.remove(5);
		System.out.println(no);
		no.removeAll(no1);
		System.out.println(no);
		no1.clear();
		System.out.println(no1);
		System.out.println(no1.isEmpty());
		System.out.println(no);
		no.set(1, 3);
		System.out.println(no);
		System.out.println(no.get(1));
		
		Object[] a1=no.toArray();
		for(Object k: a1)
		{System.out.println(k);
			
		}
		
		
		
		
	}

}
