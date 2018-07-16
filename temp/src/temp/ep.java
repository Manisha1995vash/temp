package temp;
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;



public class ep 
{ /*
     * Complete the function below.
    */
public static int lengthofPalindrome(String input1)
   
 {
	//Write code here
  
   int a[]= new int[input1.length()];
char c[]=input1.toCharArray();
int num[]=new int[10]; 

int i,j,l,t=-2,k,check=0,m,temp,temp2;
for(i=0; i<input1.length(); i++)
{ a[i]=Integer.parseInt(c[i]+"");}
for(i=0; i<input1.length(); i++)
{ for(j=i+1; j<input1.length(); j++)
   { if( a[i]==a[j])
     {   l=j-i-1;t=0;// System.out.println(a[i]+" "+l);
        if(l<=(a.length-j-1))
        { for( k=1; k<=l;k++)
          { temp=0;
            temp2=0;
            if(num[a[i+k]]==0)
            { for(m=1; m<=l;m++)
              { if(a[i+m]==a[i+k])
                 temp=temp+1;
                if(a[j+m]==a[i+k])
                 temp2=temp2+1;
               }
            } 
            if(temp==temp2 &&(temp!=0 && temp2!=0))
            num[a[i+k]]=1;
            else
            {t=-1;break;}
           }
          
        
       if(t==0)
       { if(check<=(j-i+1))
          check=(j-i);//System.out.println("ss"+check);
       }}}
      for(k=0;k<=9;k++)
      num[k]=0;
      }
  }


return(2*check);


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
