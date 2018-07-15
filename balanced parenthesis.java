import java.util.*;
import java.lang.*;
class blanced_paranthesis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int len=ch.length;
        int count=0,count1=0,x=0,y=0,u=0,k=0;
        int pos[]=new int[len];
        int pos1[]=new int[len];
        String m="";
        for(int i=0;i<len;i++){
            if(ch[i]=='('){
                count++;
                pos[u]=i;
                u++;
            }
            if(ch[i]==')'){
                count1++;
                pos1[k]=i;
                k++;
            }
        }
        if(count>count1){
            for(int i=0;i<len;i++){
          m="";
          m+=str.substring(0,pos[i])+str.substring(pos[i]+1);
          x++;
            if(x==count1){
                break;
            }
        }
        }
        if(count1>count){
            for(int i=0;i<len;i++){
          m="";
          m+=str.substring(0,pos1[i])+str.substring(pos1[i]+1);
          y++;
            if(y==count){
                break;
            }
        }
        }
        System.out.print(m);
    }
}
