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



