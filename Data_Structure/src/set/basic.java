package set;
import java.util.*;
public class basic {
	
	public static void main(String ma[]) {
		Set<Integer> a=new HashSet<>();
		Set<Integer> b=new HashSet<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		b.add(5);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
			
		
		System.out.println(a);
		a.remove(3); 
		
		a.retainAll(b);
		System.out.println(a+"\n"+b);
		
		LinkedHashSet<String> aa=new LinkedHashSet<>();
		aa.add("fun");
		aa.add("gun");
		aa.add("ton");
		aa.add("sun");
		aa.add("nun");
		aa.add("run");
		System.out.println(aa);
		
		TreeSet<String> a1=new TreeSet<>(aa);	
		System.out.println(a1);
		
		Iterator a11=aa.iterator();
		while(a11.hasNext())
			
		{
			System.out.println(a11.next());
		}
	
	}

}
