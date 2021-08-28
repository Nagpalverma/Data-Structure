package Vector_Stack;

public class Mystack <E> {
	
	public static class node<F>
	{
		F data;
		node<F> next;
		
		node(F data)
		{
			this.data=data;
			next=null;
		}
	}
	node<E> head;

 void push(E data)
 {
	 node<E> toadd=new node<>(data);
	 node<E> temp= head;
	 if(head==null)
	 {
		 head=toadd;
		 return;
	 }
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }temp.next=toadd;
 }
 
 E pop()
 { E y;
	 node<E> temp=head;
	 if(head==null)
	 {
		 System.out.println("error");
		 return null ;
	 }
	 if(head.next==null)
	 {
		  y=head.data;
		 head=null;
		 return y;
	 }
	 while(temp.next.next!=null)
	 {
		 temp=temp.next;
	 }
	 y=temp.next.data;
	 temp.next=null;
	 return y;
 }
 
 E peek()
 {
	 node<E> temp=head;
	 if(head==null)
	 {
		 System.out.println("invalid");
		 return null;
	 }
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }
	 return temp.data;
 }
		
 void print()
 {
	 node<E> temp=head;
	 
	 while(temp!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
 }

	}


