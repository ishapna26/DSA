1. Palindrome Numbers: The number that is same when read from both forward and backward direction.
Logic: Get a number , revert it check if the original number==reverted number.

reverse a number and store in a variable : int sum=0;  "sum=sum*10+mod;"

Problem:
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int original=n;
        int sum=0;

        while(n>0){
            int mod=n%10;
            sum=(sum*10)+mod;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }
    }
}

2. Write a program that gets n as input and print the reverse of the number:
Input : 325345
Expected output: 543523

//Just print 
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        while(n>0){
            int mod=n%10;
            System.out.print(mod);
            n=n/10;
        }
    }
}

//reverse and store and print
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        while(n>0){
            int mod=n%10;
            sum=(sum*10)+mod;
            n=n/10;
        }
        System.out.println(sum);
    }
}

3. Factorial of a number:
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        if(n==0){
          fact=1;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

//using recursion
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int output=fact(n);
        System.out.println(output);
    }
    static int fact(int n){
        int factorial=1;
        if(n==0||n==1){
            factorial=1;
        }
        else{
            factorial=n*fact(n-1);
        }
        return (factorial);
    }
}

//Prime Numbers
4. Write a program that gets n as input and print all the prime numbers till that number.
Input : 5
Expected output:
2 3 5

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int num=2;num<=n;num++){
            int count=0;
            for(int j=2;j<=num;j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count<2){
                System.out.print(num+" ");
            }
        }

    }
}

NOTE : TO check if a number is palindrome or not run only upto root(n) because after root n the factors pairs just reverse like n=4 (1*4, 2*2, 4*1)
class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not a prime
            }
        }
        return true; // Prime
    }
}

5. Given an integer n, find the number of divisors of n that are divisible by 3.
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i%3==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}




    

