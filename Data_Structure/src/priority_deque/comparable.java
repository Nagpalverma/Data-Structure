package priority_deque;
import java.util.*;

public class comparable implements Comparable{
	int no;
	String m;
	comparable(int no,String m)
	{
		this.no=no;
		this.m=m;
	}
	
	
	public String toString()
	{
		return this.m+" "+this.no;
		
	}
	
	public  static void main(String aaaa[])
	{
		comparable a1=new comparable(1,"aa");
		comparable a2=new comparable(2,"bb");
		comparable a3=new comparable(3,"cc");
		comparable a4=new comparable(4,"dd");
		comparable a5=new comparable(5,"ee");
		comparable a6=new comparable(6,"ff");
		
		
		PriorityQueue<comparable>  a=new PriorityQueue<>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a6);
		
		System.out.println(a);
		while(!a.isEmpty())
	System.out.println(	a.poll());
		
		
		
	}




	@Override
	public int compareTo(Object o) {
		comparable a=(comparable)o;
		
		return this.m.compareTo(a.m);
	}

	




}
