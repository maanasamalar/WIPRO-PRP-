import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    int count=0;
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if(a[i+1]-a[i]==1){
	            count++;
	        }
	        else{
	            System.out.println(a[i]+1);
	            break;
	        }
	    }
	}
}
