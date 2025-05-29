NOTES / FORMULAS:
1. n%2==0 (To check even)
2. n%10 (To find the last digit of a number) Eg. 123 ie. last digit=3
3. n=n/10 (To eliminate the last digit of a number) Eg.123 result=12

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
