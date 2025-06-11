note: Pair<Integer, String> p = new Pair<>(1, "One");
1. Given an array arr. Your task is to find the minimum and maximum elements in the array. //USED GENERICS TO RETURN VALUE: SYNTAX: return new Pair<>(val1,val2);
Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int n=arr.length;
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new Pair<>(min,max);
    }
}

2. You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0)
NOTE: ArrayList<Integer>=new ArrayList<>();
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i=i+2){
            res.add(arr[i]);
        }
        return res;
    }
}

3. linear search -> Brute force approach in which the loop rununtil it finds the elements first occurrence/ last occurrence.
   It is used to find the elements position in the array by moving linearly.

4. Input: arr = [1, 2, 3, 2, 1] ->Palindrome Array
   Output: true

class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n=arr.length;
        int[] arr2=new int[n];
        for(int i=n-1;i>=0;i--){
            arr2[(n-1)-i]=arr[i];
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=arr2[j]){
                return false;
            }
        }
        return true;
    }
}

5. sieve of eratosthenes

import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(a[i]==0) {
			   for(int j=i*2;j<=n;j=j+i) {
				   a[j]=1;
			   }
		
		    }
		}
		
		for(int k=2;k<=n;k++) {
			if(a[k]==0) {
				System.out.print(k+" ");
			}
		}
		
	}
}
    


  
