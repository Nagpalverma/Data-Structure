package tree;
import java.util.*;
public class binarytree {
public static class mybt{
	node root;
	
	public static class node{
		int x;
		node left,right;
		node(int c)
		{
			x=c;
			left=right=null;
		}	
	}
	
	Scanner sc=new Scanner(System.in);
	
	public node create(int x)
	{
		node ad=new node(x);	
	
	System.out.println("enter left element.");
	
      int y1=sc.nextInt();
      if(y1==-1)
     	ad.left= null;
      else
    {
       	ad.left=create(y1);
     }
	
		
	System.out.println("enter right element.");
	int y=sc.nextInt();
	if(y==-1)
		ad.right=null;
	else
	{
		ad.right=create(y);
	}

	return ad;
	}

	void inorder(node root)
	{
		node temp=root;
		if(temp.left!=null)
		{
			
			inorder(temp.left);
		}
		
    System.out.println(temp.x);
     
    if(temp.right!=null)
	{  
    
		inorder(temp.right);
	}
    
	}
}
	public static void main(String[] args) {
		
		mybt aa=new mybt();
		aa.root=aa.create(7);
		aa.inorder(aa.root);
		

	}

}
