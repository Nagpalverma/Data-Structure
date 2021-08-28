package LinkedList;

public class MylinkedList <E>{
	public static class node<E>
	{
		E data;
		node<E> next;
		
		node(E data)
		{
			this.data=data;
			next=null;
		}
	}
		node<E> head;
		
	
public void add(E data)
		{ 
	    	node<E> temp=head;
			node<E> toAdd=new node<>(data);
			
			if(isEmpty())
			{
				head=toAdd;
				return;
			}
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toAdd;
		    }

boolean isEmpty()
		{
		return head==null;		
		}

void set(int index ,E value) 
{
	node<E> temp=head;
	int indexs=0;
	

	
	while(indexs!=index && temp!=null)
	{
		temp=temp.next;
		indexs+=1;
	}
	if(indexs==index&&temp!=null)
	{
		temp.data=value;
		
	}
	else
		System.out.println("not a valid index");
	
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

E get(int index)
{
	node<E> temp=head;
	int indexs=0;
	
		while(indexs!=index && temp!=null)
		{
			temp=temp.next;
			indexs+=1;
		}
		if (indexs==index&&temp!=null)
			return temp.data;

		return null;
}

 int size() 
{
	node<E> temp=head;
	int index=0;
	while(temp!=null)
	{
		index+=1;
		temp=temp.next;
	}
	if(head!=null)
	return index;
	else {
		System.out.print("invalid ");
	return 0;
}
	}
 

void remove(int i)
{
	node<E> temp=head;
	int indexs=0;
	if(head==null)
	{
		System.out.println("invalid");
		return;
	}
	if(i==0)
	{
		head=temp.next;
		return;
	}
	
		while(indexs<i-1 && temp.next!= null)
		{
			temp=temp.next;
			indexs+=1;
		}
		
		 if(indexs==i-1)
			{
			temp.next=temp.next.next;
			}
		else
			System.out.println("invalid operation");
	}
 
void removeAll(MylinkedList<E> a)
{
	int x=a.size();
	int y=this.size();
	for(int i=0;i<x;i++)
	{	
		for(int j=0;j<y;j++)
		{	
			if(this.get(j)==a.get(i)) 
			{
				this.remove(j);
				j--;
				y--;
			}
	    }
	}
}

void add(int i,E data)
{
	E y;
	node<E> toadd=new node<>(data);
	node<E> temp=head;
	int x=this.size()-1;
	int index=0;
	
	
	if(head==null && i!=0)
	{
		System.out.println("invalid operation");
		return;
	}
	if(i<=x) {
	while(index<i && temp.next!=null)
	{
		temp=temp.next;
		index+=1;
	}
	if(temp!=head )
	{
		y=temp.data;
		temp.data=toadd.data;
		toadd.data=y;
		toadd.next=temp.next;
		temp.next=toadd;

			
	}
	else
	{
		toadd.next=head;
		head=toadd;
	}
	}
	else
		System.out.println("invalid operation");
}

void addAll(MylinkedList<E> a)
{
	node<E> temp=head;
	node<E> temp2=a.head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=temp2;
}
}	

