import java.io.*;
import java.util.*;
import java.lang.*;
class series1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,sum=0,j=1;
		for(i=1;i<=n;i++){
		    sum=(int)(sum+Math.pow(i,j)/i);
		    j++;
		}
		System.out.println(sum);
	}
}

