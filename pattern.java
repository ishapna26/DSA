//zoho pattern
N=3
1
2 6
3 7 9
4 8
5

#include<stdio.h>

void main() {
    int n;
    scanf("%d", &n);
    
    for(int i = 1; i <= 2 * n - 1; i++) {
        int row = (i > n) ? (2 * n - i) : i;
        int val = i;

        for(int j = 1; j <= row; j++) {
            printf("%d ", val);
            val += (2 * (n - j));
        }
        printf("\n");
    }
}

n=5
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

#include<stdio.h>

void main() {
    int n;
    scanf("%d", &n);
    
    for(int i = 1; i <=n; i++) {
        int val=i;
        for(int j = 1; j <= i; j++) {
            printf("%d ", val);
            val +=(n - j);
        }
        printf("\n");
    }
}

	
n = 4
Expected output:

****

***

**

*

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


n = 4
Expected output:

4321

321

21

1

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int start=n-i+1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(start);
                start--;
            }
            System.out.println();
        }
    }
}

n = 4
Expected output:

*

**

***

****

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*******
 *****
  ***
   *

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


n= 6

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int start=1;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}

12345
22345
33345
44445
55555

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}

1   5
 2 4 
  3  
 2 4 
1   5
    
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i||j==n-i+1) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

5   1
 4 2 
  3  
 2 4 
1   5

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mid=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i){
					if(i<mid) {
					    System.out.print(n-j+1);
					}
					else {
						System.out.print(j);
					}
				}
				else if(j==n-i+1) {
					if(i<mid) {
					    System.out.print(n-j+1);
					}
					else {
						System.out.print(j);
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

15 14 12  9  5
   13 11  8  4
      10  7  3
          6  2
             1

#include <stdio.h>

void main() {
    int n;
    scanf("%d", &n);

    for (int i = n; i >= 1; i--) {
        int val = i;
        int row[50];  // temp array to store values in the row

        // Build row values
        for (int j = 0; j < i; j++) {
            row[j] = val;
            val += (n - j - 1);
        }

        // Print leading spaces
        for (int s = 1; s <= n - i; s++) {
            printf("    ");
        }

        // Print row values in reverse
        for (int j = i - 1; j >= 0; j--) {
            printf("%-4d", row[j]);
        }

        printf("\n");
    }
}
