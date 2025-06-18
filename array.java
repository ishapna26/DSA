INTRODUCTION TO DSA:
Data: Data is an important part of the program
Program: A program is a set of instructions which performs operation on data.
Data Structure: The way you organize data in main memory during execution time of a program. (Two types: Physical DS and Logical DS) / structured way to store data. 
                                                                                                             |             |
                                                 (How the data is arranged in the memory- Arrays, Matrices, Linked List) (How the data can be arranged and utilized- Stack,Queues, Graphs, Trees, Hashing).

Recursion usually felt inefficient because it uses stacK DS internally, (not useful for solving larger problems)

INTRODUCTION TO ARRAYS:
Arrays: Arrays are defined as a collection of "similar" data items stored "contiguously" in the memory blocks.
in c: int arr[10]; -> declaration int arr[3]={0,1,2} -> Declaration and Initialization;

Why we store same DataType in a Array? Since array stores memory contiguously the data type needs to be same.
How to access an element in an array? Through Index -> arr[3]. Initially the array stores the starting elements address. eg. Assume 100 is the starting element address. Then arr[3] address will be calculated 
                                                                                                                             by 100+(3(index)*4(int datatype size=4bytes))=100+12=112(4 th elements address)

1. Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.

Approached in 3 ways:
1. Sort the list. Find the first largest then traverse the array in reverse check the condition if(largest!=arr[i]) ->secl=arr[i] --> break;
2. Find the max element from the array and then the condition to find second lagest must be arr[i]<max && arr[i]>=secl;
3. optimized solution: finf firstl and secondl in same loop
import java.util.*;

class Main{
	public static void main(String[] args) {
		int[] arr= {64,35,64,34};
		int n=arr.length;
		
		int firstl=arr[0];
		int secondl=-1;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>firstl) {
				secondl=firstl;
				firstl=arr[i];
			}
			else if(arr[i]!=firstl && arr[i]>secondl) {
				secondl=arr[i];
			}
		}
		System.out.println(secondl);
		
	}
}

ii. To find the answer for the gn question above: ie. smallest element

// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int n=arr.length;
        int firstmin=Integer.MAX_VALUE; //it stores the integers maximum possible value
        int secondmin=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<firstmin){
                secondmin=firstmin;
                firstmin=arr[i];
            }
            else if(arr[i]!=firstmin && arr[i]<secondmin){
                secondmin=arr[i];
            }
        }
        if(secondmin==Integer.MAX_VALUE){
            int[] res={-1};
            return res;
        }
        else{
            int[] res={firstmin, secondmin};
            return res;
        }
        
    }
}

NOTES: Why didnt we use arr[0] and secondmin=-1; 

- If all array values are positive, initializing secondmin = -1 is risky, because:
- You are trying to store second smallest value.
- But -1 is smaller than any positive number and the condition (arr[I]<secondmin) is never gonna get executed.


Third Largest Element
class Solution {
    int thirdLargest(int arr[]) {
        int n = arr.length;
        if (n <= 2) return -1;
        int big1 = Math.max(arr[0], arr[1]);
        int big2 = Math.min(arr[0], arr[1]);
        int big3 = Integer.MIN_VALUE;

        for (int i = 2; i < n; i++) {
            // three way filtering
            if (arr[(int)i] > big3) {
                big3 = arr[(int)i];
            }
            if (arr[(int)i] > big2) {
                big3 = big2;
                big2 = arr[(int)i];
            }
            if (arr[(int)i] > big1) {
                big2 = big1;
                big1 = arr[(int)i];
            }
        }
        return big3;
    }
}

  
