import java.util.*;
import java.lang.*;
public class exp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int len=ch.length;
        int num1=0,num2=0;
        String m="";
        for(int i=0;i<len;i++){
            if(Character.isDigit(ch[i])){
                m=m+ch[i];
            }
            else if((!(Character.isDigit(ch[i]))) && (ch[i]!='=')){
                num1=Integer.parseInt(m);
                m="";
                continue;
            }
            else if(ch[i]=='='){
                num2=Integer.parseInt(m);
                m="";
            }
        }
        int res=Integer.parseInt(m);
        if(num1+num2==res){
            System.out.print("+");
        }
        else if(num1-num2==res){
            System.out.print("-");
        }
        else if(num1*num2==res){
            System.out.print("*");
        }
        else if(num1/num2==res){
            System.out.print("/");
        }
    }
}
