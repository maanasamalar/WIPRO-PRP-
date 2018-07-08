import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,m;
        for(i=n;i>=1;i--){
            for(j=1;j<=n;j++){
                System.out.print(i);
            }
           // System.out.println();
            for(k=1;k<(n-i)*2;k++){
                System.out.print(" ");
            }
           // System.out.println();
            for(m=1;m<=n;m++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


o/p :
999999999999999999
888888888 888888888
777777777   777777777
666666666     666666666
555555555       555555555
444444444         444444444
333333333           333333333
222222222             222222222
111111111               111111111


