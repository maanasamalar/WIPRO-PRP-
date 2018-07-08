//transpose of matrix into 90 degrees
package sample;

import java.util.Scanner;

public class rotate_matrix {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] a=new int[m][n];
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(i=n-1;i>=0;i--){
			for(j=0;j<m;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
