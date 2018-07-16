package temp;

import java.util.Scanner;
/*5 10
3 4
1 5
4 2
5 4
5 4
5 4
3 5
4 3
4 3
1 3
3 5
5 4
1 5
3 4*/

public class Gift
{ static int num[];
  public static int func(int r[], int d[], int rd, int dr, int n, int m,int num[],int e) 
  {  int i,j,t=0;
  for(i=0; i<2*n-2; i++)
  {t=0;
    if(r[i]==rd && i!=e)
    {// e=i+1;
    	if(d[i]==dr)
    	{num[r[i]-1]=num[r[i]-1]+1;
    	return 1;
    	}
    	else
   	 {
   	 if(i>0 && r[i-1]==d[i] && d[i-1]==r[i])
  		 e=i-1;
  	 else if(i<2*n-3 && r[i+1]==d[i] && d[i+1]==r[i])
  		 e=i+1;
   	 
    	  t=func(r,d,d[i],dr,n,m,num,e);
    	  if(t==1)
    		  break;
    	 
    	 }
    	 
    }}
    if(t==1)
	   { num[r[i]-1]=num[r[i]-1]+1;
	      return 1;
	   }
    
    else  
  return 0;
	  
  }

	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
	  Scanner s=new Scanner(System.in);
	  
	  int n=s.nextInt();
	  int m=s.nextInt();
	  int d[]=new int[2*n-2];
	  int r[]=new int[2*n-2];
	  num=new int[n];
	  int rd[]=new int[m];
	  int dr[]=new int[m];
	  int i,j,x,y;
	  for(i=0; i<n-1; i++)
	  {
		  x=s.nextInt();
		  y=s.nextInt();
		  r[2*i]=x;
		  d[2*i]=y;
		  r[2*i+1]=y;
		  d[2*i+1]=x;
		  
	  }
	  for(i=0; i<m; i++)
	  {
		  rd[i]=s.nextInt();
		  dr[i]=s.nextInt();
	  }
	  
//	  for(i=0; i<2*n-2; i++)
//	  System.out.print(r[i]+" ");
//	  System.out.println();
//	  for(i=0; i<2*n-2; i++)
//		  System.out.print(d[i]+" ");
//		  System.out.println();

     for(i=0; i<n; i++)
    	 num[i]=0;
       for(i=0; i<m; i++)
       {//num[rd[i]-1]=num[rd[i]-1]+1;
       func(r,d,rd[i],dr[i],n,m,num,-1);
       num[dr[i]-1]=num[dr[i]-1]+1;
       }
       int max=num[0];
      // System.out.println();
       for(i=0; i<n; i++)
       {  //System.out.print(num[i]+" ");
         if (max<num[i])
        	 max=num[i];
       }//System.out.println();
       System.out.println(max);
	}

}
