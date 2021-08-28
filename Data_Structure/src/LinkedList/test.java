package LinkedList;

public class test {

	public static void main(String[] args) throws Exception {
		MylinkedList<Integer> ll=new MylinkedList<>();
		MylinkedList<Integer> ll1=new MylinkedList<>();
 		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(4,9);
		
		ll1.add(5);
		ll1.add(4);
		ll1.add(8);
	
	//ll.set(3, 9);
//	System.out.println(	ll.size());
		ll.addAll(ll1);
	ll.print();
//		ll.removeAll(ll1);
//	ll.print();

//System.out.println(ll.get(4));

	}

}
