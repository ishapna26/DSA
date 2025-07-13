SORTING: Arranging elements in a sorted order is called sorting. There are two Types of sorting : 1. Comparison Based Sort (Bubble, Insertion, Selection, Merge, Heap)
                                                                                                  2. Index Based Sort (Count sort, Bucket sort, Radix sort)
  
1. Bubble sort: In every iteration we will move the unsorted max element to the right position using adjacent swapping.                                TIME COMPLEXITY: O(n^2)            
---------------

import java.util.*;

class Main{
	public static void main(String[] args) {
	int[] a= {6, 8, 1, 2, 5, 4};
	int n=a.length;
	
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(a[j]>a[j+1]) {
				swap(a,j,j+1);
			}
		}
	}
	
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");	
	}
	}
	
	public static void swap(int[] a, int n1, int n2) {
		int temp=a[n1];
		a[n1]=a[n2];
		a[n2]=temp;
	}
}

2. Merge Sort -> Divide and Conquer Algorithm.                                                                                                            TIME COMPLEXITY: O(n log n)      
--------------
An array is divided into n sublists. These sublists are then merged to produce sorted list.

import java.util.*;

class Main2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {369,1,90,45,2,4,-1};
		int n=a.length;
		
		int [] b=new int[n];
		int lb=0,ub=n-1;
		mergeSort(a,b,lb,ub);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
	public static void mergeSort(int[] a, int[] b, int lb, int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			mergeSort(a,b,lb,mid);
			mergeSort(a,b,mid+1,ub);
			merge(a,b,lb,mid,ub);
			
			for(int i=lb;i<=ub;i++) {
				a[i]=b[i];
			}
		}
	}
	
	public static void merge(int[] a, int[] b, int lb, int mid, int ub) {
		int i=lb,j=mid+1,k=lb;
		
		while(i<=mid && j<=ub) {
			if(a[i]<=a[j]) {
				b[k]=a[i];
				i++;
				k++;
			}
			else if(a[j]<=a[i]) {
				b[k]=a[j];
				j++;
				k++;
			}
		}
		if(j>ub) {
			while(i<=mid) {
				b[k]=a[i];
				i++;
				k++;
			}
		}
		else {
			while(j<=ub) {
				b[k]=a[j];
				j++;
				k++;
			}
		}
	}
}

3. Counting Sort  
------------------
It is an index based sort in which the frequency of the elements are stored in an array and the cumulative distribution for that array is found and the elemnts are sorted based 
on that.
Time Complexity:  O(n+k)
Space Complexity: O(n+k)
import java.util.*;

class Main5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] unsorted=new int[n];
		int[] sorted=new int[n];
		
		for(int i=0;i<n;i++) {
			unsorted[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(unsorted[i]>max) {
				max=unsorted[i];
			}
		}
		
		int n2=max+1;
		int[] count=new int[n2];
		
		//find unsorted array element's frequency
		for(int i=0;i<n;i++) {
			count[unsorted[i]]++;
		}
		
		//find cumulative distribution of the element
		for(int i=1;i<n2;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		//sort according to the cumulative value: it gives the index of the element
		//traverse the unsorted list from n-1 to 0 for stable sorting
		for(int i=n-1;i>=0;i--) {
			sorted[count[unsorted[i]]-1]=unsorted[i];
			count[unsorted[i]]--;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(sorted[i]+" ");
		}
	}
}
