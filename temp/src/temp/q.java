package temp;
import java.util.Scanner;


public class q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int u=s.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0; i<n; i++)
		{ a[i]=s.nextInt();
		
		}
		double d1=0,d;
		for(i=u; i<n; i++)
		{ for(j=i;j>=i-u;i--)
		  { if(a[i]-a[j]>u)
		    	break;
		   }
		  d=(a[i]-a[j+2])/(a[i]-a[j+1]);
		  if(d>d1)
			  d1=d;
		
		}
		System.out.println(d1);

	}
	

}
