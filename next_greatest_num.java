import java.util.*;
import java.lang.*;
public class nextgreatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        char[] ch=str.toCharArray();
        int l=str.length();
        int count;
        String v="1";
        String m="";
        for(int i=0;i<l;i++){
            v+=0;
        }
        int l1=Integer.parseInt(v);
        for(int j=n+1;j<l1;j++){
            m=String.valueOf(j);
            count=0;
            for(int k=0;k<m.length();k++){
                char p=ch[k];
                if(m.contains(String.valueOf(p))){
                    count++;
                }
            }
             if(count==l){
            System.out.println(m);
            break;
        }
        }
       
    }
}
