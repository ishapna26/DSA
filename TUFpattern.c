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
    
e.  1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1  

f.  1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15

  
g.  *****
    ****
    ***
    **
    *
    
h.  5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1    
    
i.  1 2 3 4 5
    1 2 3 4 
    1 2 3
    1 2 
    1    
