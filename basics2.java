/*Prob 1:
Write a program which takes two values x and y. Prints x for y number of times.
Input: 2  3
Expected Output
2
2
2*/
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int y= sc.nextInt();

        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}

//Prob 2:
//Write a program to take x and print multiples of x till 1000.

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();

        int i=1;
        while(true){
            System.out.println(x*i);
            if((x*i)>=1000){
                break;
            }
            else{
                i++;
            }
        }
    }
}

/*Prob 3:
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.*/

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String str1= sc.nextLine();
         String str2= sc.nextLine();

         int n= sc.nextInt();

         String full_name = str1+str2;

         for(int i=0;i<n;i++){
             System.out.println(full_name);
         }

    }
}
