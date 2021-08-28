package ArrayList;

public class genrics {
public static  class pair<X ,Y>{
	
	X x;
	Y y;
	
//	String x;
//	String y;
//	
	
	//without generics
	
//	pair(String x ,String y)
//	{ 
//		this.x=x;
//		this.y=y;
//	}
	
	
	//with genrics
	pair(X x, Y y){
		this.x=x;
		this.y=y;
	}

	
}
	
	public static void main(String[] args) {
	pair a=new pair("nfjv","kmkm");
		pair b=new pair("mkv",4);
		pair<String ,Integer> a1=new pair("djj",1);
		pair<Character,Double> b1=new pair('a',3);
		
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		

	}

}
