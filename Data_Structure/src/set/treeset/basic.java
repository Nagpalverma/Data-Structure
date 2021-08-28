package set.treeset;
import java .util.*;

public class basic {
	public static class emp{
		String n;
		int f;
		emp(String n,int f)
		{
			this.n=n;this.f=f;
		}
		
		public String toString()
		{
			return this.n+" "+this.f;
		}
	}
	
	public static void main(String args[])
	{
		emp a1=new emp("ram",1);
		emp a2=new emp("mohan",2);
		emp a3=new emp("sohan",3);
		emp a4=new emp("yo",4);
		emp a5=new emp("hum",6);
		emp a6=new emp("tum",5);
		emp a7=new emp("mum",7);
		emp a8=new emp("jam",8);
		
		
		emp a10=new emp("ram",1);
		emp a9=new emp("ram",2);
		emp a11=new emp("nmnm",1);
		emp a12=new emp("ram",1);
		emp a13=new emp("ram",1);
		emp a14=new emp("ram",1);
		emp a15=new emp("ram",1);
		emp a16=new emp("ram",1);
		
		
		TreeSet<emp> aa=new TreeSet<>(new Comparator() {
			public int compare(Object o1,Object o2) {
				emp a=(emp)o1;
				emp a1=(emp)o2;
				if(a.f>a1.f)
					return -1;
				else if(a.f<a1.f)
					return 1;
				else return 0;
			}
		});
		
		
		
		TreeSet<emp> a=new TreeSet<>(new Comparator() {
			public int compare(Object o1,Object o2) {
				emp a=(emp)o1;
				emp a1=(emp)o2;
				if(a.f>a1.f)
					return -1;
				else if(a.f<a1.f)
					return 1;
				else return 0;
			}
		});
		a.add(a9);
		a.add(a10);
		a.add(a11);
		a.add(a14);
		a.add(a15);
		a.add(a16);
		a.add(a12);
		a.add(a13);
		
		
		System.out.println(a+" \n"+a.size());
		
		
		aa.add(a1);
		aa.add(a2);
		aa.add(a3);
		aa.add(a4);
		aa.add(a5);
		aa.add(a6);
		aa.add(a7);
		aa.add(a8);
		aa.add(a1);
		aa.add(a1);
		aa.add(a1);
		
		System.out.println(aa+"\n"+aa.size());
		
		
	}

}
