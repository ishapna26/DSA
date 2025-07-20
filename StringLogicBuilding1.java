1. Reverse the String:
----------------------
//Brute Force
import java.util.*;
class Main7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String reversed="";
		StringBuilder reverse=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
			reverse.append(str.charAt(i));
		}
		System.out.println(reversed);
		System.out.println(reverse.toString());
    str=reversed;
	}
}

(or)
//using 2 pointers
import java.util.*;
class Main7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		char[] letter=str.toCharArray();
		int left=0;
		int right=letter.length-1;
		
		while(left<right) {
			char temp=letter[left];
			letter[left]=letter[right];
			letter[right]=temp;
			left++;
			right--;
		}
		String reversed=new String(letter);
		System.out.print(reversed)	;
	}
}
