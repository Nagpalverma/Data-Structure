package priority_deque;

import java.util.*;

public class heap {
	
	int max(int a,int b)
	{
		return a>b?a:b;
	}
	//creating heap by heaify.
	public heap(LinkedList<Integer> a)
	{
	int i=a.size();
	for(int k=i-2;k>0;k-=2)
	{
		
		int m1=max(a.get(k),a.get(k+1));
		int m=((k+1)/2)-1;
		if(m1>a.get(m))
		{
			int temp=m1;
			if(a.get(k)==m1)
			a.set(k, a.get(m));
			else
				a.set(k+1, a.get(m));
			a.set(m, temp);			
		}	
	}
	for(int k=2;k<i;k+=2)
	{
		int m1=max(a.get(k),a.get(k-1));
		int m=((k)/2)-1;
		if(m1>a.get(m))
		{
			int temp=m1;
			if(a.get(k)==m1)
			a.set(k, a.get(m));
			else
				a.set(k-1, a.get(m));
			a.set(m, temp);			
		}	
		
	}
	System.out.println(a);
		
	}
	
	

	public static void main(String ards[])
	{
		LinkedList<Integer> a=new LinkedList<>();
		a.add(3);
		a.add(5);
		a.add(13);
		a.add(52);
		a.add(32);
		a.add(15);
		heap a1=new heap(a);
	
		
		
System.out.println(a.hashCode());
		
	}
	
}
