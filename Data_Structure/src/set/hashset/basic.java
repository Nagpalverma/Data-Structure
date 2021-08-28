package set.hashset;
import java .util.*;
public class basic {
	public static class run{
		int no;
		String name;
		run(int no,String name)
		{
			this.no=no;
			this.name=name;
		}
	
		public String  toString()
		{
			return this.no+" "+this.name;
		}
		
		public int hashCode()
		{
			return this.no;
		}
		
		public boolean equals(Object o)
		{
			run a=(run) o;
			if(this.no==a.no)
		//	if(this.name.equals(a.name) )
				return true;
			else
				return false;
		}
	}
public static void main(String assssa[])
{
	run a1=new run(1,"ram");
	run a2=new run(1,"ram");
	run a3=new run(1,"ram");
	run a4=new run(1,"ram");
	run a5=new run(1,"ram");
	run a6=new run(1,"ram");
	run a7=new run(1,"ram");
	run a8=new run(1,"mohan");
	
	
	
	HashSet<run> a=new HashSet<>();
	a.add(a1);
	a.add(a2);
	a.add(a3);
	a.add(a4);
	a.add(a5);
	a.add(a6);
	a.add(a7);
	a.add(a8);
	a.add(a1);
	System.out.println(a.size()+"\n"+a);
	
}
}
