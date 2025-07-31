//find the missing elements in a sorted array
import java.util.*;

class Main9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		ArrayList<Integer> missingElement=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int diff=a[0]-0;
		
		for(int i=1;i<n;i++) {
			if(a[i]-i!=diff) {
				if((a[i]-i)-diff>1) {
					int val=(a[i]-i)-diff;
					for(int j=0;j<val;j++) {
						missingElement.add(diff+i+j);
					}
					diff=a[i]-i;
				}
				else {
				missingElement.add(diff+i);
				diff=a[i]-i;
				}
			}
			
		}
		
		for(int num:missingElement) {
			System.out.print(num+" ");
		}
		
	}
}

(or)

import java.util.*;

class Main9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int l=a[0];
		int h=a[n-1];
		
		int[] frequency=new int[h+1];
		
		for(int i=0;i<n;i++) {
			frequency[a[i]]++;
		}
		
		ArrayList<Integer> missingNumber=new ArrayList<>();
		
		for(int i=l;i<h+1;i++) {
			if(frequency[i]==0) {
				missingNumber.add(i);
			}
		}
		
		for(int num:missingNumber) {
			System.out.print(num+" ");
		}
	}
}

2. Zoho Pattern
import java.util.*;

class Main9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int len=str.length();
		int count=1;
		char ch=0;
		String res="";
		for(int i=0;i<len-1;i++) {
			ch=str.charAt(i);
			if(ch!=str.charAt(i+1)) {
				if(count>1) {
				res+=""+count+""+ch;
				}
				count=1;
			}
			else {
				count++;
			}
		}
		if(count>1) {
			res+=""+count+""+ch;
		}
		
		System.out.print(res);	
	}
}
