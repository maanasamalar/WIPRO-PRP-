//odd positions: print as it is
//even positions: print in reverse order
import java.util.*;
import java.lang.*;
public class stroddeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().replaceAll(" ","");
        char[] ch=str.toCharArray();
        int len=ch.length;
        int i;
        String str1=" ",str2=" ";
        for(i=0;i<len;i++){
            if(i%2==0){
                str1=str1+ch[i];
            }
        }
        for(int j=len-1;j>=0;j--){
            if(j%2!=0){
                str2=str2+ch[j];
            }
        }
        System.out.println(str1+str2);
        //System.out.println(str2);
    }
}


