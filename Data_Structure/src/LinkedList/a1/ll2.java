package LinkedList.a1;

public class ll2<f> {
	
	node head,tail;
	
	public static class node<e>
	{		int i=0;
		e data;
		node pre;
		node next;
		node(e data)
		{
			this .data=data;
			pre=null;
			next=null;
		}
	}

	
	public void add(f data)
	{
		node<f> to=new node(data);
		
		if(head==null)
		{
		head=tail=to;
		head.i=0;
		
		}
		else
			
		{
			to.i=tail.i+1;
			to.pre=tail;
		tail.next=to;
		tail=to;
		}
}
	
	public void add(int j,f data)
	{
		node<f> to=new node<>(data);
node<f>	temp=head;
		
		if(j>=0)
		{
			while(temp.i<j-1) 
				temp=temp.next;
			to.next=temp.next;
			temp.next.pre=to;
			temp.next=to;
			to.pre=temp;
			
			while(to.next!=null)
			{
				to.i=to.pre.i+1;
				to=to.next;
			}
			
		}
		else
			System.out.println("false");
	}
	
	void print()
	{
		node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.i+" "+temp.data);
		
			temp=temp.next;
			
		}
	}
	
	public static void main(String aaa[])
	{
		ll2<Integer> a2=new ll2<>();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		a2.add(2,9);
		a2.print();
	}
}