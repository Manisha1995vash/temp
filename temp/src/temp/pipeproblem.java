package temp;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


public class pipeproblem {
	
	 /*
	     * Complete the function below.
	    */


	public static int[] joinedPipes (int[] input1)
	   
	 { 
		//Write code here
	 
		if(input1.length==1)
			{int ans[]={0}; return ans;}
		else
		{ int ans[]=new int[input1.length-1];
		int i=0;
		
		
		
		for(i=0;i<input1.length-1;i++)
			{ Arrays.sort(input1);
			ans[i]=input1[i]+input1[i+1];
			input1[i]=-1; 
			input1[i+1]=ans[i];
		}return ans;
		}
		
		
	    }


	 public static void main(String[] args) throws IOException
	{
	        Scanner in = new Scanner(System.in);
	       
	 int[] output = null;
	     
	   int ip1_size = 0;
	      
	  ip1_size = Integer.parseInt(in.nextLine().trim());
	  
	      int[] ip1 = new int[ip1_size];
	        
	int ip1_item;
	       
	 for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++)
	 {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	 
	           ip1[ip1_i] = ip1_item;
	        }
	       
	 output = joinedPipes (ip1);
	       
	 for(int output_i=0; output_i < output.length; output_i++) 
	{
		        	System.out.println(String.valueOf(output[output_i]));
		            }
	    }
	}


