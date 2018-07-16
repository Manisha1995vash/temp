package temp;
import java.util.Scanner;
public class temp1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
   int nu=s.nextInt(); 
   int i,num,p=0,n=0;
     for(i=0; i<2*nu; i++)
    	 {num=s.nextInt();
    	   if(i%2==0)
    		   {if(num<0)
    			   n++;
    		   else
    			   p++;
    		   }
    	   }
      if(p<=1 || n<=1)
    	  System.out.println("yes");
      else
    	  System.out.println("NO");
     }

}
