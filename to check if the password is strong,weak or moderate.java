import java.util.*;
import java.lang.*;
public class password{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int i,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,len;
        len=ch.length;
        for(i=0;i<len;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                count1++;
            }
            if(ch[i]>='A' && ch[i]<='Z'){
                count2++;
            }
            if(ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]=='$' || ch[i]=='%' || ch[i]=='^' || ch[i]=='&' || ch[i]=='*' || ch[i]=='(' || ch[i]==')' || ch[i]=='-' || ch[i]=='+'){
                count3++;
            }
            if(ch[i]>='1' && ch[i]<='9'){
                count4++;
            }
        }
            if(len>=8){
                count5++;
            }
            if(len>=6){
                count6++;
            }
            if(count1>=1 && count2>=1 && count3>=1 && count4>=1 && count5>=1){
                System.out.println("Strong");
            }
            else if(count1>=1 && count2>=1 && count3>=1 && count6>=1){
                System.out.println("Moderate");
                
            }
            else
                System.out.println("Weak");
        }
}
