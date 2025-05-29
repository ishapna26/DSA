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
//yet to be uploaded

x.          1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        int start=i;
        for(int k=1;k<=(n-i);k++){
            printf(" ");
        }
        
        for(int j=1;j<=((2*i)-1);j++){
            if(j==i){
                printf("1");
            }
            else{
                if(j<i){
                    printf("%d",start);
                    start--;
                }
                else{
                    start++;
                    printf("%d",start);
                    
                }
                
            }
        }
        printf("\n");
    }
}

v.    **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********

#include <stdio.h>

void main() {
    int n;
    scanf("%d", &n);

    for (int i = 1; i <= 2 * n; i++) {
        int row = i > n ? 2 * n - i + 1 : i;

        for (int j = 1; j <= 2 * n; j++) {
            if (j <= n - row + 1 || j > n + row - 1)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }
}

    


w.     *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

 

y.     1      1
       12    21
       123  321
       12344321
    
#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        int start=i;
        for(int j=1;j<=i;j++){
            printf("%d",j);
        }
        for(int k=1;k<=2*(n-i);k++){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("%d",start);
            start--;
        }
        printf("\n");
    }
}


z.       4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
