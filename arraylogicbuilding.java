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


