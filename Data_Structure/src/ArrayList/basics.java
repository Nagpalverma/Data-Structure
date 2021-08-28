package ArrayList;

import java.util.*;

public class basics {
	

	public static void main(String[] args) {
		List<String> name=new ArrayList();
		name.add("nagpal");
		name.add("kanha");
		name .add("kartikey ji");
		List<String> rollno=new ArrayList();
		rollno.add("42");
		rollno.add("21");
		rollno.add("18");
	
		name.addAll(rollno);
		
		name.remove(5);
		
		name.removeAll(rollno);
		
		name.add(0,"har har Mahadev");
		
name.add("word");

name.set(4,"ganesh ji");

		System.out.println(name.get(1));
		
		rollno.clear();
		
		System.out.println(rollno.isEmpty());
		
	Object	a[]=name.toArray();
	
	for(Object k:a )
		
		
	System.out.println(k);
	}

}
