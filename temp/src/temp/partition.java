package temp;
import java.util.Scanner;

public class partition {
	public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	   }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m[][]=new int[n][2];
		int num[]=new int[n];
		int i,j,k,c=0;
Double 	d;
   for(i=0; i<n;i++)
		{ m[i][0]=s.nextInt();
		 m[i][1]=s.nextInt();
		}
   
  System.out.println(Math.log(125)/Math.log(5));
  
		for(i=0;i<n; i++)
		{if(m[i][0]==1)
			   ++c;
		for(j=m[i][0]; j<=m[i][1]; j++)
		{ for(k=2;k<=j/2;k++)
		{ d=Math.log(j)/Math.log(k);
			if((Math.ceil(d) == Math.floor(d)) && d>1)
			{++c;System.out.println(j);
			break;}
			
		}
		}
		num[i]=c;
		c=0;
		}
		for(i=0; i<n;i++)
			System.out.println(num[i]);

	}

}
