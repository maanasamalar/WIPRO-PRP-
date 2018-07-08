1) 
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int j=1;
    for(int i=1;i<=n;i++)
    {
        sum=(int)(sum+Math.pow(i,j)/i);
        j++;
    }
    System.out.println(sum);
    }
}

2)

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
    int n,fact=1;
    double sum=0.0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int j=1;
    for(int i=1;i<=n;i++)
    {   fact=fact*i;
        sum=(double)(sum+Math.pow(i,j)/fact);
        j++;
    }
    System.out.println(sum);
    }
}

3)

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
    int n,fact=1;
    double sum=0.0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int j=1;
    for(int i=1;i<=n;i++)
    {   fact=fact*i;
    if(i%2==0){
        sum=(double)(sum-Math.pow(i,j)/fact);
        j++;
    }
    else{
        sum=(double)(sum+Math.pow(i,j)/fact);
        j++;
    }
    }
    System.out.println(sum);
    }
}
