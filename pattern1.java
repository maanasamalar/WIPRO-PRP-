import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    int x=i;
		    for(int j=n;j>=i;j--){
		        System.out.print(x+" ");
		        x=x+j;
		    }
		    System.out.println();
		}
	}
}
