package priority_deque;
import java.util.*;
public class basic2 {
	String name;
	 int i;
		basic2(String a,int i)
		{
			this.name=a;
			this.i=i;
		}
	
	static class i1 implements Comparator
	{

		@Override
		public int compare(Object o1,Object o2) {
			basic2 a=(basic2)o1;
			basic2 a1=(basic2)o2;
			
			if(a.i>a1.i)
			return -1;
			else if(a.i<a1.i)
				return 1;
			else
				return 0;
		}
	}
	
	static class i2 implements Comparator
	{

		@Override
		public int compare(Object o1, Object o2) {
			basic2 a=(basic2)o1;
			basic2 a1=(basic2)o2;
			return -1*a.name.compareTo(a1.name);
		}
		
	}
		
		public String toString()
		{
			return this.name+ " "+this.i;
		}
		
	

	public static void main(String[] args) {
		i1 u=new i1();
		i2 u1=new i2();
		
		PriorityQueue<basic2> a=new PriorityQueue<>(u1);
		PriorityQueue<basic2> a11=new PriorityQueue<>(u);
		basic2 a1=new basic2 ("eec",1);
		basic2 a2=new basic2 ("ecc",2);
		basic2 a3=new basic2 ("ccc",3);
		basic2 a4=new basic2 ("ddc",4);
		basic2 a5=new basic2 ("ggc",5);
		
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a1);
		a.add(a1);
		
		
		a11.add(a1);
		a11.add(a2);
		a11.add(a3);
		a11.add(a4);
		a11.add(a5);
		a11.add(a1);
		a11.add(a1);
		
		
		
		System.out.println(a);
		
		while(!a.isEmpty())
		{
		System.out.println(a.remove());
		}
		System.out.println("now a11 elements ======>\n");
		while(!a11.isEmpty())
		{
		System.out.println(a11.remove());
		}

	}

	

}
