package ArrayList;
import java.util.*;
public class basics2 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> a=new ArrayList<>();
		List<Integer> b=new ArrayList<>();
		a.add(4);
		a.add(2);
		a.add(1);
		a.add(5);
		b.add(2);
		b.add(1);
		b.add(2);
		a.sort(null);
		System.out.println(a);
		List<List<Integer>> arr=new ArrayList<>();
arr.add(a);
arr.add(b);
System.out.println(arr);
arr.get(0).add(0, 4);
	System.out.println(arr.get(0).get(0));
	
	System.out.println(arr);
	System.out.println(arr.size());
int a1=9;
String s=Integer.toString(a1);
	System.out.println(s);

	}

}
