package priority_deque;

import java.util.*;

public class comparator {

	static class b1 implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1<o2)
			return 1;
			else if(o1>o2)
				return -1;
			else 
				return 0;
		}
		
	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> aa=new PriorityQueue<>();
		aa.add(1);
		aa.add(8);
		aa.add(3);
		aa.add(4);
		aa.add(2);
		aa.add(9);
		aa.add(11);
		aa.add(18);
		System.out.println(aa);
		System.out.println(aa.remove()+" "+aa.remove(4)+" "+ aa);
	System.out.println(	aa.comparator());
	
	
	
	Comparator u=new b1();
	PriorityQueue<Integer> bb=new PriorityQueue<>(u);
	bb.add(1);
	bb.add(8);
	bb.add(3);
	bb.add(4);
	bb.add(2);
	bb.add(9);
	bb.add(11);
	bb.add(18);
	
	
	for(int i=0;i<5;i++)
		System.out.println(bb.remove());

	}

}
