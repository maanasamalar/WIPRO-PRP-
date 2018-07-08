import java.util.*;
public class stringweight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        char[] ch=str.toCharArray();
        int n=sc.nextInt();
        int b,sum=0,count=0;
        String m="";
        if(n==1){
            for(int i=0;i<str.length();i++){
                char s=str.charAt(i);
                b=(int)s;
                int a=b-96;
                sum=sum+a;
                
            }
            System.out.println(sum);
        }
        else if(n==0){
            for(int i=0;i<str.length();i++){
                char s=str.charAt(i);
                if(s!='a' && s!='e' && s!='i' && s!='o' && s!='u'){
                    m+=s;
                    count++;
                }
            }
            for(int i=0;i<count;i++){
                char v=m.charAt(i);
                b=(int)v;
                int a=b-96;
                sum=sum+a;
            }
            System.out.println(sum);
        }
    }
}


