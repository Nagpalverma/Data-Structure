package Vector_Stack;
import java.util.*;
public class basics {
	public static void main(String[] args)
	{
//		Vector<String> av=new Vector<>();
//		av.add("bhjbjkf");
//		av.add("mmknrg");
//		System.out.println(av.get(1));
//		
//		
//	Stack<Integer>	a=new Stack<>();
//	a.push(0);
//	a.push(1);
//	a.push(4);
//	
//	a.push(3);
//	int peeked=a.peek();
//	a.pop();
//	System.out.println(peeked);

		Mystack <Double> ms=new Mystack<>();
		ms.push(0.1);
		ms.push(1.0);
		ms.push(0.2);
		ms.push(89.0);
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		ms.print();

	}
}
