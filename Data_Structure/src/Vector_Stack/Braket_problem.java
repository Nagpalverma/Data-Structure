package Vector_Stack;
import java.util.*;
public class Braket_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String br=sc.nextLine();
			int n=br.length();
		boolean isBal=true;
		
		Stack<Character> check=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
		if(br.charAt(i)=='(' || br.charAt(i)=='[' || br.charAt(i)=='{')
		{
			check.push(br.charAt(i));
			continue;
		}
		if(br.charAt(0)==')'|| br.charAt(0)==']'||br.charAt(0)=='}')
		{
			isBal=false;
			break;
		}
		else if(br.charAt(i)==')')
		 {
			 if(check.peek()=='(')
				 check.pop();
			 else
				 {isBal=false;
			 break;}
		 }
		 
		 else if(br.charAt(i)==']')
		 {
			 if(check.peek()=='[')
				 check.pop();
			 else
				 {isBal=false;
			 break;}
		 }
		 
		 else if(br.charAt(i)=='}')
		 {
			 if(check.peek()=='{')
				 check.pop();
			 else
				 {isBal=false;
			 break;}
		 }
		}	
		if(isBal==true && check.isEmpty())
			System.out.println(isBal);
		else
			System.out.println("false");
			
		}
	}

}
