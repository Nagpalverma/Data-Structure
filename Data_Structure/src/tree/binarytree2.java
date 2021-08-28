package tree;
import java.util.*;
public class binarytree2 {
	Scanner sc=new Scanner(System.in);
	
	node root;
	public node add(int data)
	{
		node toadd=new node(data);
		if(root==null)
		{
			root=toadd;
		}
		System.out.println("enter left child of"+ data);
		
		
		int x=sc.nextInt();
		if(x==-1)
			toadd.left=null;
		else
			toadd.left=add(x);
		
		System.out.println("enter right child of"+ data);
		int y=sc.nextInt();
		if(y==-1)
			toadd.right=null;
		else
			toadd.right=add(y);
		
		return toadd;
	}
	
	node find(int p,node a)
	{
	node temp=null;	
		if(a.left!=null && temp==null)
		temp=	find(p,a.left);
		if(a.data==p)
			return a;
		if(a.right!=null&& temp==null)
		temp=	find(p,a.right);
		return temp;
	}
	
	void print(node a)
	{
		if(a.left!=null)
			print(a.left);
		System.out.print(" "+a.data);
		if(a.right!=null)
			print(a.right);
		
	}
	public void ap(int data,int p)
	{
		node toadd=new node(data);
		if(root==null)
			root=toadd;
		else
		{
			node temp=find(p,root);
			if(temp==null) {
				System.out.println("parent is not available");
				return;}
			if(temp.left!=null && temp.right!=null)
				{System.out.println("error");
				return;}
				
				
			if(temp.left==null)
				temp.left=toadd;
			else
			temp.right=toadd;
		}
	}
	
	public int height(node a)
	{
		if(a==null)
			return -1;
		int h1=height(a.left);
		int h2=height(a.right);
		return Math.max(h1,h2)+1;
	}
	
	public int daimt(node a)
	{
		if(a==null)
			return 0;
		int h1=height(a.left);
		int h2=height(a.right);
		int d=3+h1+h2;
		int x=daimt(a.left);
		int y=daimt(a.right);
		return Math.max(d,Math.max(x,y));
				
	}
	
	public static class node
	{
	int data;
	node left,right;
	node(int data)
	{
		this.data=data;
	}
	}
	
	
	public static void main(String aa[])
	{
		binarytree2 a=new binarytree2();
		a.ap(10,0);
		a.ap(9, 10);
		a.ap(8, 10);
		a.ap(7, 10);
		a.ap(7, 9);
		a.ap(6, 9);
		a.print(a.root);
	System.out.println("\n"+	a.daimt(a.root));
System.out.println(		a.height(a.root));
		
	}

}
