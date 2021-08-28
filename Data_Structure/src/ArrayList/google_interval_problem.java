package ArrayList;

import java.util.*;

public class google_interval_problem {
	public static class interval{
		int start;
		int end;
		
		interval(int x,int y){
			this.start=x;
			this.end=y;
		}
	}

	public static void main(String[] args) {
		List<interval> intervals=new ArrayList();
		Scanner sc=new Scanner(System.in);
		interval a0=new interval(1,3);
		interval a1=new interval(5,9);
		interval a2=new interval(11,13);
		interval a3=new interval(19,24);
		
		System.out.println("enter start and end of a pair");
		
		int x=sc.nextInt();int y=sc.nextInt();
		
		interval a4=new interval(x,y);
		System.out.println("enter the case");
		int z=sc.nextInt();
		switch(z)
		{case 1:
			intervals.add(a0);
			intervals.add(a1);
			break;
		case 2:
			intervals.add(a0);
			intervals.add(a1);
			intervals.add(a2);
			break;
		case 3:
			intervals.add(a0);
			intervals.add(a1);
			intervals.add(a2);
			intervals.add(a3);
			break;
			default :
			intervals.clear();
		
		}
		
		if (intervals.isEmpty())
			intervals.add(a4);
		else if(intervals==null)
			intervals.add(a4);
		else {	
		int i=0;
		while(i<intervals.size()) 
		{interval temp=intervals.get(i);
			
			if(temp.end<a4.start)
			{
				i++;
				continue;
			}
			else if(a4.end<temp.start)
			{
				intervals.add(i, a4);
				break;
			}
			else
			{
				a4.start=Math.min(a4.start, temp.start);
				a4.end=Math.max(a4.end, temp.end);
				intervals.remove(i);
						
			}
		}
		
		
			if(i==intervals.size())
				intervals.add(a4);
			}
		
		Iterator<interval> it=intervals.iterator();
		{
			while(it.hasNext()) 
			{interval tem=it.next();
			System.out.println(tem.start+" "+tem.end);
				
				
				
			}
		}

	}

}
