package sample;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1,sum=0;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println(sum);
        
    }
}

