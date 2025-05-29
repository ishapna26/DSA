n = 4
Expected output:

****

***

**

*

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


n = 4
Expected output:

4321

321

21

1

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int start=n-i+1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(start);
                start--;
            }
            System.out.println();
        }
    }
}

n = 4
Expected output:

*

**

***

****

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*******
 *****
  ***
   *

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


n= 6

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int start=1;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}

12345
22345
33345
44445
55555

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}

