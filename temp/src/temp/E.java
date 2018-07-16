package temp;
import java.util.Scanner;

public class E {

	public static void main(String[] args)
	{ 
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,num,t=0,j;
		String ans[]=new String[n];
		for(i=0; i<n; i++)
		{ num=s.nextInt();
		  for(j=0; j<=num;j=j+7)
		  { if((num-j)%3==0)
			  {t=1; ans[i]="YES";
			   break;}
		    
		 }
		  if(t==0)
		    	ans[i]="NO";
		    t=0;
		  }
		for(i=0; i<n;i++)
			System.out.println(ans[i]);
		
		

	}

}
