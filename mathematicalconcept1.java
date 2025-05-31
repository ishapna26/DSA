NOTES / FORMULAS:
1. n%2==0 (To check even) || n & 1==0 (using bitwise operator to check even or not)
2. n%10 (To find the last digit of a number) Eg. 123 ie. last digit=3
3. n=n/10 (To eliminate the last digit of a number) Eg.123 result=12
4. long res=(long)Math.pow(a,b) - To find the power of the digit
  
//program
1. Write a program that gets n as input and print the number of digits in the number

Testcase 1 : Input : 325345
  
Expected output: 6

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        while(n>0){
            int mod=n%10;
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
}

2. Find the sum of first and Last digit of a number
  
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last;
        int first=0;
        if(n>=0&&n<=9){
            last=0;
        }
        else{
            last=n%10;
        }
        while(n>0){
            int mod=n%10;

            n=n/10;

            first=mod;
        }
        System.out.println(first+last);
    }
}

3. Given two numbers a and b, find kth digit from right of ab.
Example 1:
Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        int k=sc.nextInt();
        long res;
        long last=0;
        res=(long)Math.pow(a,b);

        for(long i=1;i<=k;i++){
            last=res%10;
            res=res/10;
        }
        System.out.println(last);
    }
}
