package map.hashmap;
import java.util.*;
public class newc {
	static class mark{
		int x;
		mark(int x)
		{
			this.x=x;
		}
		
		public String toString ()
		{
			return "marks:"+x;
		}
	}
	
	static class student
	{
		int roll;
		String name;
		student(String name,int roll)
		{
			this .roll=roll;
			this.name=name;
		}
		
		public int hashCode()
		{
			return this.roll;
		}
		
		public boolean equals(Object o)
		{
			student a=(student)o;
			if(this.roll==a.roll)
			return true;
			else return false;
		}
		
		public String toString()
		{
			return roll+" "+name;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	HashMap<student,mark> a=new HashMap<>();
		student a1=new student("ram",1);
		student a2=new student("shayam",2);
		student a3=new student("mohan",3);
		student a4=new student("sohan",4);	
		student a5=new student("nagpal",5);	
		student a6=new student("banti",6);
		student a7=new student("sid",7);
		student a8=new student("kartikey",8);

	mark b1=new mark(91);
	mark b2=new mark(99);
	mark b3=new mark(95);
	mark b4=new mark(94);
	mark b5=new mark(97);
	mark b6=new mark(98);
	mark b7=new mark(92);
	mark b8=new mark(93);
	
	
	a.put(a1,b1);
	a.put(a2,b2);
	a.put(a3,b3);
	a.put(a4,b4);
	a.put(a5,b5);
	a.put(a6,b6);
	a.put(a7,b7);
	a.put(a8,b8);
	a.put(a1,b1);
	a.put(a1,b1);
	a.put(a1,b1);
	a.put(a1,b8);
	
	
		System.out.println(a.size() +" "+a);

	}

}
