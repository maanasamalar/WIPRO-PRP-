#include <stdio.h>
#include<math.h>
int main() {
	int n,i,j=0,sum=0,fact=1,a;
	scanf("%d",&n);
	for(i=1;i<=n;i++){
	    fact=fact*1;
	    a=pow(i,i);
	    if(i%2==0){
	    sum=sum-(a/fact);
	    }
	    else{
	        sum=sum+(a/fact);
	    }
	}
	printf("%d",sum);
	return 0;
}



