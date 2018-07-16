

package temp;
import java.util.Scanner;

public class mapping
{ static int func(String sr)
	{ char ch[]=sr.toCharArray();
	  int i=0,j=-1,k=0,t=-1;
	  String s[]=sr.split("#");
	 
	  int m[][]=new int[s.length][s.length];
int n=s.length;
	  for(i=0; i<s.length; i++)
	  {String st[]=s[i].split("@");
	    for(j=0; j<s.length; j++ )
	    	m[i][j]=Integer.parseInt(st[j]);
	  }
	  for(i=0; i<n; i++)
	  { for(j=0; j<n; j++)
	    {  if(i==0 && j==0 && m[i][j]==-1)
	    { t=Math.min(Math.min(m[i+1][j+1],m[i+1][j]),m[i][j+1]);
	    if()
	    }
	    }
	  }
	 
	for(i=0; i<n; i++)
		{for(j=0; j<n; j++)
			System.out.print(m[i][j]+" ");
	    System.out.println();}
	return 0;
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		int n=func(sr);

	}

}
