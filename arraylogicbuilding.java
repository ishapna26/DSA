1. Sort 0s,1s and 2s:
---------------------
3 Methods to solve the problem: 1. sorting 2. Counting and allocation 3. Dutch National Flag Algorithm

2. Counting and allocation
import java.util.*;

class Main2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int zero=0,one=0,two=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				zero++;
			}
			else if(a[i]==1) {
				one++;
			}
			else {
				two++;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(i>=0 && i<zero) {
				a[i]=0;
			}
			else if(i>=zero && i<zero+one) {
				a[i]=1;
			}
			else {
				a[i]=2;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}

3. Dutch National Flag Algorithm: The Dutch National Flag Algorithm is a famous algorithm developed by " Edsger Dijkstra " to solve a specific classification problem: 
   " sorting an array with only three distinct elements, " typically 0s, 1s, and 2s.

import java.util.*;

class Main2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int left=0,mid=0,right=n-1;
		
		while(mid<=right) {
			if(a[mid]==1) {
				mid++;
			}
			else if(a[mid]==0) {
				int temp=a[mid];
				a[mid]=a[left];
				a[left]=temp;
				mid++;
				left++;
			}
			else if(a[mid]==2) {
				int temp=a[mid];
				a[mid]=a[right];
				a[right]=temp;
				right--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}

4. MissingNumber 2
Sample Inputs:
5           2
1 2 4 5     1
Sample Outputs: 0
3           2

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int total=(n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            sum+=a[i];
        }
        System.out.println(total-sum);
    }
}

5. Rotate Array: formula [ a[i]= a[i-1] ] whre i=n-1;
import java.util.*;

class Main2{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] a=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int temp=a[n-1];
        
        for(int i=n-1;i>=1;i--) {
        	a[i]=a[i-1];
        }
        a[0]=temp;
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
    }
}
	
6. Rotate array by k:
-> Brute Force Approach
import java.util.*;

class Main2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=1;i<=k;i++) {
			int temp=a[n-1];
			for(int j=n-1;j>=1;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
			
		}

		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

2. better 
import java.util.*;

class Main2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		k=k%n;
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int start=n-k;
		int[] temp= new int[k];
		int j=0;
		for(int i=start;i<n;i++) {
			temp[j]=a[i];
			j++;
		}
		for(int i=start-1;i>=0;i--) {
			a[i+k]=a[i];
		}
		for(int i=0;i<temp.length;i++) {
			a[i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");;
		}
	}
}

3. optimal


reomove duplicates:
	
