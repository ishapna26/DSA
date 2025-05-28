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


q.       *
        * *
       *   *
      *     *
     *********

#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        if(i==n){
            for(int j=1;j<=(2*n)-1;j++){
                printf("*");
            }
        }
        else{
            for(int j=1;j<=n-i;j++){
                printf(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                if((k==1)||k==((2*i)-1)){
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
}



r.   *********
      *     *
       *   *
        * *
         *

#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        if(i==1){
            for(int j=1;j<=(2*n)-1;j++){
                printf("*");
            }
            printf("\n");
        }
        else{
            for(int k=1;k<=i-1;k++){
                printf(" ");
            }
            for(int j=1;j<=(2*(n-i)+1);j++){
                if(j==1||j==(2*(n-i)+1)){
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
    }
}


t.     ****
       *  *
       *  *
       *  *
       ****

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        if(i==1||i==n){
            for(int j=1;j<=n;j++){
                printf("*");
            }
        }
        else{
            for(int j=1;j<=n;j++){
                if(j==1||j==n){
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
}


u.        *****
         *   *
        *   *
       *   *
      *****

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        if(i==1||i==n){
            for(int k=1;k<=n-i;k++){
                printf(" ");
            }
            for(int j=1;j<=n;j++){
                printf("*");
            }
        }
        else{
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=n;j++){
            if(j==1||j==n){
            printf("*");
            }
            else{
                printf(" ");
            }
        }
        }
    printf("\n");

    }
}

s.       *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
