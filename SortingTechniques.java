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
