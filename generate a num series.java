import java.util.*;
import java.lang.*;
class number_series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        String m1=String.valueOf(m);
        int n=sc.nextInt();
        String n1=String.valueOf(n);
        String str="";
        str+=m1;
        str+=n1;
        String v="";
        int len,count=0;
        for(int i=m;i<5000;i++){
            count=0;
            v=String.valueOf(i);
            char[] ch=v.toCharArray();
            len=ch.length;
            for(int j=0;j<len;j++){
                char c=ch[j];
                if(str.contains(String.valueOf(c))){
                    count++;
                }
            }
            if(count==len){
                System.out.print(i+" ");
            }
        }
        
    }
}
i/p: 3 4
o/p:
3 4 33 34 43 44 333 334 343 344 433 434 443 444 3333 3334 3343 3344 3433 3434 3443 3444 4333 4334 4343 4344 4433 4434 4443 4444 
