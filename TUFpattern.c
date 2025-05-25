a.  *****
    *****
    *****
    *****
    ***** 

#include<stdio.h>
void main(){
    
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            printf("*");
        }
        printf("\n");
    }
}
   
b.  1 1 1 1
    2 2 2 2
    3 3 3 3
    4 4 4 4
  
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
  
c.  *
    **
    ***
    ****
    *****

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

d.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5 

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d",j);
        }
        printf("\n");
    }
}
    
e.  1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1  

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int start;
    for(int i=1;i<=n;i++){
        if((i%2)!=0){
            start=1;
        }
        else{
            start=0;
        }
        for(int j=1;j<=i;j++){
            printf("%d",start);
            start= 1-start;
        }
        printf("\n");
    }
}

//or

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int start;
    for(int i=1;i<=n;i++){
        if((i%2)!=0){
            start=1;
        }
        else{
            start=0;
        }
        for(int j=1;j<=i;j++){
            printf("%d",start);
            start= !start;
        }
        printf("\n");
    }
}

f.  1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int c=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d ",c);
            c++;
        }
        printf("\n");
    }
}

g.  *****
    ****
    ***
    **
    *

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}
   
h.  5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1    

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            printf("%d",i);
        }
        printf("\n");
    }
}
    
i.  1 2 3 4 5
    1 2 3 4 
    1 2 3
    1 2 
    1    

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int c;
    for(int i=n;i>=1;i--){
        c=1;
        for(int j=1;j<=i;j++){
            printf("%d",c);
            c++;
        }
        printf("\n");
    }
}

j.  *
    **
    ***
    ****
    ****
    ***
    **
    *
   
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
    
    for(int s=1;s<=n;s++){
        for(int k=1;k<=(n-s)+1;k++){
            printf("*");
        }
        printf("\n");
    }
 }

j.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

//my broken code (not advisable but works)
#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=(2*n)-1;i++){
        if(i>n){
            for(int j=n-1;j>=1;j--){
                for(int k=1;k<=j;k++){
                    printf("*");
                }
                printf("\n");
            }
            break;
        }
        else{
            for(int j=1;j<=i;j++){
                printf("*");
            }
        }
        printf("\n");
    }
    
}

//or

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=(2*n)-1;i++){
        if(i>n){
            for(int j=1;j<=(2*n)-i;j++){
                printf("*");
            }
            printf("\n");
        }
        else{
            for(int j=1;j<=i;j++){
                printf("*");
            }
            printf("\n");
        }
    }
}

k.       *
        **
       ***
      ****
     *****

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}

l.   *****
      ****
       ***
        **
         *
#include<stdio.h>

void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=n; i>=1;i--){
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}

m.      *
       ***
      *****
     *******
    *********

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            printf("*");
        }
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        printf("\n");
    }
}

n.  *********
     *******
      *****
       ***
        *
#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
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

o.      *
       ***
      *****
     *******
    ********* 
     *******
      *****
       ***
        *  

//my code with high cost
#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    for(int i=1; i<=(2*n)-1;i++){
        if(i>n){
            for(int s=1;s<=(n-1);s++){
                for(int k=1;k<=s;k++){
                    printf(" ");
                }
                for(int j=1;j<=2*((n-1)-s)+1;j++){
                    printf("*");
                }
                for(int k=1;k<=s;k++){
                    printf(" ");
                }
                printf("\n");
            }
            break;
        }
        
        else{
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            printf("*");
        }
        printf("\n");
        }
    }
}







   
