Binary Search: Divide and conquer technique (Time complexity: O (log n) )
--------------
1. Binary Search is searching technique performed on a sorted array only.
2. It is a very efficient searching technique.
3. It can be implemented using iteration and recursion.
   ie. Iterative Binary Search
       Recursive Binary Search

4. It divides the array into n subarray and performs the search.

code:
import java.util.*;

class Main9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] a=new int[n];
		int index=-1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		Arrays.sort(a);
		
		int l=0;
		int r=n-1;
		
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]==key) {
				index=mid;
				break;
			}
			if(key<a[mid]) {
				r=mid-1;
			}
			if(key>a[mid]) {
				l=mid+1;
			}
		}
		System.out.print(index);
		
	}
}
