package sample;

import java.util.Scanner;

public class factors {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,k=0,sum=0;
		for(i=1;i<n;i++){
			if(n%i==0){
				//System.out.println(i);
				a[k]=i;
				k++;
			}
		}
		for(i=0;i<k;i++){
			
			//System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}
}

