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
		
		int n=sc.nextInt();
		int a[] =new int[n];
		int b[] =new int[n];
		int lb=0,ub=n-1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
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
	public static void merge(int[] a, int b[] , int lb, int mid, int ub) {
		int i=lb,j=mid+1,k=i;
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





