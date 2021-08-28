package map.treemap;
import java.util.*;
public class basic {
	public static class shop{
		String name;
		int no,wage;
		shop(int no,int wage,String name)
		{
			this.name=name;
			this.no=no;
			this.wage=wage;
		}
		public String toString()
		{
			return name+" /number:"+no+" /wage:"+ wage;
		}
	}
	
	public static class area{
		String region,street;
		
		area(String region,String street)
		{
			this.region=region;
			this.street=street;
		}
		
		public String toString()
		{
			return "region:"+region+" /Street:"+street;
		}
		
	}
	
	
	
	public static void main(String aa[]){
		shop a1=new shop(5,10000,"bob");
		shop a2=new shop(2,20000,"oggy");
		shop a3=new shop(9,90000,"jack");
		shop a4=new shop(10,100000,"rayan");
		shop a5=new shop(15,150000,"count custum");
		shop a6=new shop(20,200000,"pawn shop");
		
		area b1=new area("varansi","assi ghat");
		
		
TreeMap<shop,area> a=new TreeMap<>(new Comparator()
		{
	public int compare(Object o1,Object o2)
	{
		shop a1=(shop) o1;
		shop a2=(shop) o2;
		
		return a1.name.compareTo(a2.name);
		
	}
		});
a.put(a1, b1);
a.put(a2, b1);
a.put(a3, b1);
a.put(a4, b1);
a.put(a5, b1);
a.put(a6, b1);
a.put(a1, b1);
a.put(a1, b1);
a.put(a1, b1);
a.put(a1, b1);

System.out.println(a.size()+" "+a);
		
	}

}
