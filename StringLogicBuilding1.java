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

2. Palindrome:
--------------
import java.util.*;
class Main {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder reversed=new StringBuilder();
        
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        if(str.equals(reversed.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }
    }
}

(or)
import java.util.*;
class Main {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        boolean isPalindrome=true;
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.print("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }
    }
}

3. Rotate String:
import java.util.*;

class Main8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String goal=sc.nextLine();
		boolean flag=false;
		for(int i=1;i<=str.length();i++) {
			String var=str.substring(i)+str.substring(0,i);
			
			if(var.equals(goal)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.print("true");
		}
		else {
			System.out.print("false");

		}
	}
}
