import java.util.*;
public class patter2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(j);
            }
            for(k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
o/p:
1234
2341
3412
4123
