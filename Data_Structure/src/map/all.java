package map;
import java.util.*;
import java.util.Map.Entry;
public class all { 
	
public static void main(String aa[])
{
Map<Integer,String> a=new HashMap<>();
Map<Integer,String> a1=new HashMap<>();

a.put(1,"aa");
a.put(2, "bb");
a.put(3,"cc");
a.put(4, "dd");
a.put(5,"ee");
a.put(6, "ff");
a.put(1,"mmm");
a.put(2, "ut");


a1.put(5,"uuu");
a1.put(8, "ff");
a1.put(9,"mmm");
a1.put(1,"zz");
a1.put(2, "xx");
a1.put(3,"yy");
a1.put(4, "ww");
a1.put(0, "ut");


System.out.println(a);
System.out.println( a.get(4));
System.out.println(a.keySet()+" \n"+a.values()+"\n"+a.containsKey(5)+"\n"+a.containsValue("mm")+"\n"+a.remove(2)+"\n"+a.size());
a.putAll(a1);
System.out.println(a);
System.out.println(a1+" \n"+ a.equals(a1));


Collection<String> a2=a.values();
for(String s: a2)
{
	System.out.println(s);
}

System.out.println( a.entrySet());

Set<Entry<Integer, String>> b=a1.entrySet();

Iterator<Entry<Integer,String>> b1=a1.entrySet().iterator();
while(b1.hasNext())
{
	Entry<Integer,String> aaa=b1.next();
	
	System.out.println(aaa.getValue()+"=="+aaa.getKey());
}




	
}
}
