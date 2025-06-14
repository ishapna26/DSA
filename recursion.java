RECURSION : A function calling itself over and over until the specified base condition is reached is called recursion. TWO PHASES: 1. Calling Phase(Eg. Bulb switched on while entering rooms)  
                                                                                                                       2. Returning Phase (Eg. After visiting rooms and while returning bulbs are switched on)
A function that employs that recursion is called as " recursive function. "

Eg. void fun(){
      if(base condition){
       - very important otherwise the recursion will be infinite call;
      }
      1. code //Executes at calling Time. - Ascending phase (GETS EXECUTED WHEN THE FUNCTION IS CALLED)
      fun()
      2. code //Executes at returning Time. - Descending Phase (GETS EXECUTED WHEN THE FUNCTION IS RETURNING)
   }

Difference Between Loop and a Recursion
  - Loop (Only have ascending phase)
  - A recursion can have both ascending and descending phase

HOW TO SOLVE ANY RECURSIVE PROBLEMS:
-----------------------------------
1. Break the problem into smaller problem.
2. Build Logic behind the smaller problem.
3. Find the recursive step for given problem.
4. Find base condition.
5. Build recursive tree.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
PROBLEMS
1. Print numbers from 1 to n without the help of loops
Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10

class Solution {
    public void printNos(int n) {
        // Code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" "); //gets executed at returning time;
    }
}

2. The Fibonacci sequence is defined as follows: 0 1 1 2 3 5 8 ...
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1

// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}

3. Count the number of zeroes in a number
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countz(n));
	}
	public static int countz(int n) {
		if(n%10==n) {
			if(n%10==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		if(n%10==0) {
			return 1+countz(n/10);
		}
		else {
			return 0+countz(n/10);
		}
	}
}

4. Write a recursive algorithm to find the count of digits in a number.
Example:
Input: 353445

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(count(n));
	}
	
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		if(n%10==n) {
			return 1;
		}
		return 1+count(n/10);
	}
}

5. Write a recursive program to find the sum of digits of a number
Example: Input: 342
Output: 9
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(count(n));
	}
	
	public static int count(int n) {
		n=Math.abs(n);
		if(n%10==n) {
			if(n<0) {
				return -n;
			}
			else {
				return n;
			}
		}
		int mod=n%10;
		return mod+count(n/10);
	}
}

6. Write a Program to find the power of a number recursively. Take two inputs, number and the power.

Example: Input: 2 3
Output: 8
	
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		System.out.println(power(a,b));
		sc.close();
	}
	public static long power(long a, long b) {
		if(b==0) {
			return 1;
		}
		return a*power(a,b-1);
	}
}

7. Traverse Array using Recursion:                                        
forward:
-------
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int i=0;
		traverse(a,n,i);
	}
	
	public static void traverse(int[] a, int n, int i) {
		if(i>=n) {
			return;
		}
		System.out.print(a[i]+" ");
		i=i+1;
		traverse(a,n,i);
	}
}
reverse:
--------
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int i=n;
		traverse(a,n,i);
	}
	
	public static void traverse(int[] a, int n, int i) {
		if(i<=0) {
			return;
		}
		System.out.print(a[i-1]+" ");
		i=i-1;
		traverse(a,n,i);
	}
}

8. Linear Search using Recursion
	
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int i=0;
		System.out.print(traverse(a,n,i,key));
	}
	
	public static int traverse(int[] a, int n, int i, int key) {
		if(i>=n) {
			return -1;
		}
		if(a[i]==key) {
			return i;
		}
		return traverse(a,n,i+1,key);
		
	}
}

9. sum of array 

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int [] a=new int[n];
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}
		System.out.print(sumf(a,n,i));
	}
	public static int sumf(int[] a, int n, int i) {
		if(i>=n) {
			return 0;
		}
		int sum=0;
		sum+=a[i];
		i=i+1;
		return sum+=sumf(a,n,i);
	}
}


10. Array sorted or not

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int[] a=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}
		System.out.print(isSorted(a,n,i));
		
	}
	public static boolean isSorted(int [] a, int n, int i) {
		if(i>=n-1) {
			return true;
		}
		if(a[i]>a[i+1]) {
			return false;
		}
		i=i+1;
		return isSorted(a,n,i);
	}
}

11. Write a program to print the divisors of a number recursively.
Input: 6
Output: 1 2 3 6

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		print(n,i);
	}
	public static void print(int n, int i) {
		if(i>=n+1) {
			return;
		}
		if(n%i==0) {
			System.out.print(i+" ");
		}
		i=i+1;
		print(n,i);
	}
}

