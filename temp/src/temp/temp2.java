package temp;
import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int i,p=0,q,t=0,r=0,pr;
		a=a%b;
		pr=a;
		while(a!=0 && r<2)
		{ q=(a*10)/b;//System.out.println(q);
		  if(q==c)
		  {++p; ++t;
		   break;}
		  ++p;
		  a=(a*10)%b;
		  if(pr==a)
		   ++r;
		  else
			  pr=a;
		  //System.out.println(a);
		  
		 
		};
		if(b==1 && c==0)
			System.out.println(1);
		else if(c==0 && t==0)
			System.out.println(++p);
		else if(b==1 || a==0)
			System.out.println(-1);
		else if(r==2)
			System.out.println(-1);
			
		else 
		System.out.println(p);
		

	}

}
