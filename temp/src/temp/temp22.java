package temp;
import java.io.*;
import java.util.*;

public class temp22 {

	

	
	    public void solution(int N){
	        //
	        // write your logic here and print the desired output
	        //
	        int i,j,t,k,z=-1;
	         for(i=0; i<N; i++)
	          { t=0;z=z+2;
	              for(j=0; j<N-i; j++)
	            {System.out.print(" ");
	            }
	            for(k=0; k<(((i+1)*2)-1); k++)
	            { if(k<(i+1))
	              {++t;
	               System.out.print(t);}
	              else
	              {--t;
	              System.out.print(t);}
	            }
	              System.out.println();
	          }
	          for(i=0;i<N-1;i++)
	          { z=z-2;t=0;
	          for(j=0; j<=i+1; j++)
	          System.out.print(" ");
	          if(N%2!=0)
	          {for(k=0; k<z; k++)
	          { if(k<=(z/2))
	            {++t;System.out.print(t);}
	              else
	              {--t;
	              System.out.print(t);}
	            }}
	            else
	          {for(k=0; k<(N-(2*i))-1; k++)
	          { if(k<=((N-(2*i)))/2)
	            {++t;System.out.print(t);}
	              else
	              {--t;
	              System.out.print(t);}
	            }}
	            
	            
	              System.out.println();
	          }
	    }
	

	// Following is the part of the program and is provided as an assistance to read the input.
	
	    public static void main(String[] args) throws InterruptedException {
	            Scanner sc = new Scanner(System.in);
	            int N = sc.nextInt();
	            temp22 s = new temp22();
	            s.solution(N);
	    
	

}}
