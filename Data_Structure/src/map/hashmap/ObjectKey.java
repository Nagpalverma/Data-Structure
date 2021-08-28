package map.hashmap;
import java.util.*;
public class ObjectKey {
	public static class employee{
		int id;
		employee(int id)
		{
			this.id=id;
		}
		
		public int hashCode()
		{
			return this.id;
		}
		public boolean equals(Object o)
		{if(o instanceof employee)
		{   employee e1=(employee) o;
			if(this.id==e1.id)
				return true;
			else 		return false;
		}
		else return false;
	}}

	public static void main(String[] args) {
		employee e1=new employee(1);
		employee e2=new employee(1);employee e3=new employee(17);employee e4=new employee(9);
		Map<employee ,Integer> a=new HashMap<>();
		a.put(e1, 1);
		a.put(e2, 2);
		a.put(e4, 2);
		a.put(e3, 2);
System.out.println(a);		
	

	}

}
