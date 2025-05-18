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
