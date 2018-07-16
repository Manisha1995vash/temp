package temp;
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;



public class ep1
{ /*
     * Complete the function below.
    */
public static int lengthofPalindrome(String input1)
   
 {
	//Write code here
  
   int a[]= new int[input1.length()];
char c[]=input1.toCharArray();
int num[]=new int[10]; 

int i,j,l,t=-2,k,q,check=0,m,temp,temp2,s,r;
for(i=0; i<input1.length(); i++)
{ a[i]=Integer.parseInt(c[i]+"");}
for(i=0; i<input1.length(); i++)
{ for(j=i+1; j<input1.length(); j++)
   { if( a[i]==a[j])
     {   l=j-i-1;t=0; //System.out.println(a[i]+" "+l);
         for( k=0; k<input1.length();k++)
          {if(j+k<a.length)
             { //l1=(j+k+1-i)/2;
        	  t=0;
        	   for(s=i;s<j+k;s++)
        	   {   temp=0;//t=0;
        	       temp2=1;//System.out.println("ttt"+a[s]);
        	       if(num[a[s]]==0)
        	       { for(r=s+1;r<=j+k;r++)
        	          { if(a[s]==a[r])
        		         temp2=temp2+1;
        	           }
        	        }
                    if(temp2%2==0 )
                    { num[a[s]]=1;//System.out.println("pp "+a[s]+" "+temp2+" iii "+a[i]);}
                    }
                    else if(temp2%2!=0 && num[a[s]]==0)
                    {t=-1;break;}
                    
                }//System.out.println(a[i]+"uuuuu"+t);
        	   if(t==0)
                {//System.out.println("yes"+(j-i+k+1));
                if(check<=(j-i+k+1)&&((j-i+k+1)%2==0))
                    check=(j-i+k+1);//System.out.println(a[i]+"ss"+check);
                 }
          
        
                
              } for(q=0;q<=9;q++)
                  num[q]=0;
          }}
         
      }
  }


return(check);


  }

 public static void main(String[] args) throws IOException
{
        Scanner in = new Scanner(System.in);
        
int output = 0;
       
 String ip1 = in.nextLine().trim();
     
   output = lengthofPalindrome(ip1);
      
  System.out.println(String.valueOf(output));
    }


}
