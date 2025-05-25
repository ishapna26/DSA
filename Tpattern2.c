p.  * * * * *
     * * * *
      * * *
       * *
        *
        *
       * *
      * * *
     * * * *
    * * * * *

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=2*n;i++){
        if(i>n){
            for(int k=1;k<=(2*n)-i;k++){
                printf(" ");
            }
            for(int j=1;j<=((2*i)-(2*n))-1;j++){
                printf("*");
            }
            for(int k=1;k<=(2*n)-i;k++){
                printf(" ");
            }
            printf("\n");
        }
        else{
        for(int k=1;k<=i-1;k++){
            printf(" ");
        }
        for(int j=1;j<=2*(n-i)+1;j++){
            printf("*");
        }
        for(int k=1;k<=i-1;k++){
            printf(" ");
        }
        printf("\n");
        }
    }
}
