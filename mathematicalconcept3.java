TRICKS to SWAP: 1. use temp ;           TRICKS for series: use formulas n*(n+1)/2-> 1+2+3+4+..+n
                2. a=a+b b=a-b a=a-b;   LCM formula -> n1*n2/gcd(n1,n2);

6. perfect number= (sum of all divisors is equal to the number itself) Eg. 6 (1+2+3=6)
  
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1; //1*28 = 28(we should not add the same number in perfect number)
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=i){
                    sum=sum+(n/i);
                }
            }
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("non perfect");
        }
    }
}

2. count the number of prime (optimized method)
   import java.util.*;

 import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int countp=0;
        boolean prime;

        for(int num=2;num<=n;num++){
            prime=true;
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    prime=false;
                }
            }
            if(prime){
                System.out.print(num+" ");
                countp++;
            }
        }
        System.out.println();
        System.out.println(countp);
    }
}

3. GCD/HCF
  //BruteForce
  import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if((a%i==0)&&(b%i==0)){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
//Euclidean algorithm
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        if(a==0){
            a=b;
        }
        else{
            a=a;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        gcd=a;
        System.out.println(gcd);
    }
}

4. Number series - to find the nth number in a series
  
i. Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
Input: n = 4 
Output: 10
Explanation: The 4th term of the Series is 10.

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
}

ii. NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)
Input: n = 5
Output: 35 
Explanation: 1 + (1+2) + (1+2+3).. = 35
  
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int sum2=0;
		for(int i=1;i<=n;i++) {
			int val=1;
			sum+=i;
			sum2=sum2+sum;
		}
		System.out.print(sum2);
	}
}

iii. NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))
Input: n = 2
Output: 5 
Explanation: 1 + (1+3) = 5
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int sum2=0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+(2*i-1);
			sum2=sum2+sum;
		}
		System.out.print(sum2);
	}
}

iv. Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term. or [1^3 + 2^3 + 3^3...n^3 maths formula: (n(n+1)/2)^2]
Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i*i;
        }
        return sum;
    }
}

5. Given a positive integer n, find the number of perfect squares that are less than n in the sample space of perfect squares. The sample space consists 
of all perfect squares starting from 1 (i.e., 1, 4, 9, 16, 25, …)
Input: n = 9
Output: 2
Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.

class Solution {
    static int countSquares(int n) {
        // code here
        int count=1;
        for(int i=2;i<n;i++){
            if((i*i)<n&&(i*i)>=1){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}

6. LCM program { FORMULA FOR LCM = (num1*num2)/GCD(num1,num2) }

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=GCD(n1,n2);
        int lcm=(n1*n2)/hcf;
        System.out.print(lcm);
        
    }
    static int GCD(int n1, int n2) {
        int gcd=0;
        if(n1==0) {
            gcd=n2;
            return gcd;
        }
        if(n2==0) {
            gcd=n1;
            return gcd;
        }
        while(n1!=n2) {
            if(n1>n2) {
                n1=n1-n2;
            }
            if(n2>n1) {
                n2=n2-n1;
            }
        }
        gcd=n1;
        return gcd;
        
        
    }
}
