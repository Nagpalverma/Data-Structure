package set;
import java.util.*;
public class linkedhashset {
	
	

	
	
	
	
	public static class emp
	{
		int id;
		String name;
		emp(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		
		public String toString()
		{
			return id+" "+name;
		}
		
		public int hashCode()
		{
			return id;
		}
		
		public boolean equals(Object o)
		{
			emp temp=(emp)o;
			if(this.id==temp.id)
			{
				return this.name.equals(temp.name);
			}
			return false;
		}
		
	}
	
	public static void main(String arg[])
	{
		LinkedHashMap<emp,String> a=new LinkedHashMap<>();
		emp a1=new emp(1,"aaa");
		emp a2=new emp(2,"aaa");
		emp a3=new emp(3,"aaa");
		emp a4=new emp(4,"aaa");
		emp a5=new emp(1,"baa");
		 
		a.put(a1,"name");
		a.put(a2,"name2");
		a.put(a3,"vbfb");
		a.put(a4,"klkl");
		a.put(a5,"mmmm");
		System.out.println(a);
		


	System.out.println();
		
	}

}
