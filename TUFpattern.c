/*  *****
    *****
    *****
    *****
    ***** */

#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("*");
        }
        printf("\n");
    }
}

/*  1 1 1 1
    2 2 2 2
    3 3 3 3
    4 4 4 4 */

#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            printf("%d",i);
        }
        printf("\n");
    }
}

/*  *
    **
    ***
    ****
    ***** */

#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}


