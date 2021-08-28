package Queue;
import java .util.*;
public class basics {

public static void main(String[] args)
{

	//queue
	
Queue<Integer> a=new ArrayDeque<>();
a.add(3);
a.add(2);
a.add(1);
a.add(4);
a.add(5);

System.out.println(a+" \n"+a.remove()+"\n"+a.peek());

//arraydeque

ArrayDeque<Integer> a1=new ArrayDeque<>(a);

System.out.println(a1+" \n"+a1.remove()+"\n"+a1.peek()+"first=\n"+a1.getFirst()+"last=\n"+a1.getLast()+"fromlast=\n"+a1.removeLast()+"from first=\n"+a1.removeFirst()+"\n"+a1);

//linkedlist

LinkedList<Integer> a2=new LinkedList<>();
a2.add(4);
a2.add(5);
a2.add(8);
a2.add(1110);
a2.add(76543);
a2.add(6789);

System.out.println(a2+" \n"+a2.remove()+"\n"+a2.peek()+"first=\n"+a2.getFirst()+"last=\n"+a2.getLast()+"fromlast=\n"+a2.removeLast()+"from first=\n"+a2.removeFirst()+"\n"+a2);


}
}