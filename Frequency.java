import java.util.*;

public class Frequency {

	   /**
	      Returns an array of the frequencies of each element in a.
	      That is, if the returned array is f, then a[i] occurs f[i]
	      times in a.
	      @return the frequency array
	   */
	  
public static int[] frequencyOfElements(int[] a)
	 {
	   int count=0;
	   int f[]=new int[a.length];
	   
	    for(int i=0;i<a.length;i++)
	     { 
	    	for(int j=0;j<a.length;j++)
	       {
	        if(a[i]==a[j])
	        {            
	          count++;
	        }
	       }
	    	f[i]= count;
	       
	         count=0;
	     }
	    //for(int i=0; i<f.length; i++)    //Remove the comments, if you want to print the frequency array.
	    //System.out.println(f[i]);
	    return f;
	  } 
	  public static void main(String s[])
	 {
	  frequencyOfElements(new int[] {3,1,4,1,4,4}); 
	 }
}
