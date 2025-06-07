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


import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n;i++) {
			int row=(i>n)?(2*n)-i+1:i;
			for(int k=1;k<=row-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-row+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
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
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++) {
			int row=(i>n)?(2*n-i):i;
			for(int k=1;k<=n-row;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*row)-1;j++) {
				if(j==1||j==(2*row)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

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

//or

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n*2;i++){
            int rowChange=(i>n)?((2*n)-i)+1:i;
            for (int j = 1; j <= 2*n; j++) {
                if (j <= ((n - rowChange) + 1) + (2 * rowChange) - 2) {
                    if (j <= ((n - rowChange) + 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                        System.out.print("*");
                }
            }
            System.out.println();
        }
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

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int row=1;row<=2*n-1;row++){
            for(int col=1;col<=2*n-1;col++){
                int topd=row;
                int downd=(2*n)-row; //downd=(2*n)-1-row+1 = downd=(2*n)-row;
                int leftd=col;
                int rightd=(2*n)-col;
                int a=Math.min(topd,downd);
                int b=Math.min(leftd,rightd);
                int ele=Math.min(a,b);
                System.out.print(n-ele+1+" ");
            }
            System.out.println();
        }
    }
}


z(A). Similar Pattern:
1111111
1222221
1233321
1234321
1233321
1222221
1111111
    
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int row=1;row<=2*n-1;row++){
            for(int col=1;col<=2*n-1;col++){
                int topd=row;
                int downd=(2*n)-row; //downd=(2*n)-1-row+1 = downd=(2*n)-row;
                int leftd=col;
                int rightd=(2*n)-col;
                int a=Math.min(topd,downd);
                int b=Math.min(leftd,rightd);
                int ele=Math.min(a,b);
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
