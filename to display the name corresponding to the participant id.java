import java.io.*;
import java.util.*;
import java.lang.*;
class participant_seq{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[] str=new String[n];
	    int[] a=new int[n];
	    int[] b=new int[n];
	    int i,j,k=0,temp,count=1;
	    String t="";
	    for(i=0;i<str.length;i++){
	        str[i]=sc.next();
	    }
	    for(i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++){
	        b[k]=a[i];
	        k++;
	    }
	    for(i=0;i<k;i++){
	        for(j=i+1;j<k;j++){
	            if(b[i]>b[j]){
	                temp=b[i];
	                b[i]=b[j];
	                b[j]=temp;
	                t=str[i];
	                str[i]=str[j];
	                str[j]=t;
	            }
	        }
	    }
	   /* for(i=0;i<k;i++){
	        System.out.print(b[i]+" ");
	        System.out.print(str[i]+" ");
	        
	    }*/
	    for(i=0;i<k;i++){
	            if(b[i+1]-b[i]==1){
	                count++;
	                }
	            else{
	                break;
	        }
	        
	        if(count==3){
	            break;
	        }
	    }
	    //System.out.print(count);
	    if(count==3){
	        for(i=0;i<=2;i++){
	            System.out.print(str[i]+" ");
	        }
	    }
	    
	}
	
}
