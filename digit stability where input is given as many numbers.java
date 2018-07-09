import java.io.*;
import java.util.Scanner;
import java.util.*;
class digitstability {
    public static int stability(int n) {
        char[] ch=String.valueOf(n).toCharArray();
        int count=0,max=-1,i,j;
        for(i=0;i<ch.length;i++){
            count=1;
            if(ch[i]=='*'){
                continue;
            }
            for(j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='*';
                }
            }
            if(count>max && max==-1){
                max=count;
                ch[i]='*';
            }
            else if(count==max){
                ch[i]='*';
            }
            else if(count!=max && max!=-1){
                break;
            }
        }
        for(i=0;i<ch.length;i++){
            if(ch[i]!='*'){
                return -1;
            }
            else{
                //return 1;
            }
            
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      /*  int[] a=new int[100];
       
        for(int i=0;i<100;i++){
            a[i]=sc.nextInt();
            v=stability(i);
        }*/
         int v=0;
        String s[]=sc.nextLine().split(" ");
         for(int i=0;i<s.length;i++)
             {int u=Integer.parseInt(s[i]);
              v=stability(u);
              
        if(v==1)
        {
            System.out.print("stable"+" ");
        }
        else if(v==-1)
        {
            System.out.print("unstable"+" ");
        }
             }
    }
    
}
