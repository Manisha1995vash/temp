package temp;
import java.util.Scanner;

public class team {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1=s.nextLine();
		s1=s.nextLine();
		char c[]=s1.toCharArray();
		int i,j,co=0,f=0,in=0;
		for(i=0; i<n-1; i++)
		{ if((c[i]==c[i+1]) && c[i]!='?')
			{co=1;System.out.println("No");break;}
		else if(c[i]=='?')
		{ ++f; 
		if( i-1>=0&&c[i-1]!='?')
			   in=i-1;
		//System.out.println(in);
		 if(i==n-2)
			 co=2;
		
		}
		else
		{
		  if(f>0 && f%2==0 && c[in]!=c[i])
		  {co=2;System.out.println("No");break;
		  }f=0;
		 }
	
			
		}
		if(c[n-1]=='?'&& co!=1)
			System.out.println("Yes");
		else if(c[n-1]!='?'&& co==2 && f%2==0 && c[in]!=c[n-1])
			System.out.println("No");
		else if(c[n-1]!='?'&& co==2 && f%2==0 && c[in]==c[n-1])
			System.out.println("Yes");
		else if(co==0)
			System.out.println("Yes");
		
		

	}

}
