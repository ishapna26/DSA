/*Prob 1 : Write a program that takes an integer,
then a string, then a char from the user and prints them in the screen.*/

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}

/*Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
Input: 45 45 45
Expected Output: Triangle cannot be formed*/

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();

        if((s1+s2+s3)==180){
            System.out.println("Triangle can be formed");
        }
        else{
            System.out.println("Triangle cannot be formed");
        }
    }
}


/*Prob 3: 
Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greaer than or equal to 35
Fail if mark is lesser than 35
Input: 95
Expected Output: Grade A*/
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mark= sc.nextInt();

        if(mark>=90){
            System.out.println("Grade A");
        }
        else if(mark>=80){
            System.out.println("Grade B");
        }
        else if (mark>=60) {
            System.out.println("Grade C");
        }
        else if (mark>=35) {
            System.out.println("Grade D");
        }
        if(mark<35){
            System.out.println("Fail");
        }
    }
}


/*Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid.
Input: 29
Expected Output: Small*/

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size= sc.nextInt();

        switch(size){
            case 29:
                System.out.println("Small");
                break;

            case 30:
                System.out.println("Medium");
                break;

            case 38:
                System.out.println("Large");
                break;

            case 42:
                System.out.println("XLarge");
                break;

            default:
                System.out.println("invalid size");
        }
    }
}
