package ArrayList;
import java.util.*;

public class basics1 {
static	class books{
		String name;
		String writer;
		int price;
		books(String s,String w,int p)
		{
			name=s;
			writer=w;
			price=p;
		}
		
	}

	public static void main(String[] args) {
		
		List<books> Btech=new ArrayList();
		books a=new books("emft","nagpal",10000);
		books b=new books("java","banti",9000);
		Btech.add(a);
		Btech.add(b);
		
		
		System.out.println(Btech);
		System.out.println(Btech.get(0).name);

	}

}
