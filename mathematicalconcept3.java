6. perfect number= (sum of all divisors is equal to the number itself) Eg. 6 (1+2+3=6)
  
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1; //1*28 = 28(we should not add the same number in perfect number)
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=i){
                    sum=sum+(n/i);
                }
            }
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("non perfect");
        }
    }
}

2. count the number of prime (optimized method)
   import java.util.*;

 import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int countp=0;
        boolean prime;

        for(int num=2;num<=n;num++){
            prime=true;
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    prime=false;
                }
            }
            if(prime){
                System.out.print(num+" ");
                countp++;
            }
        }
        System.out.println();
        System.out.println(countp);
    }
}

3. GCD/HCF
  //BruteForce
  import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if((a%i==0)&&(b%i==0)){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
//Euclidean algorithm
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        if(a==0){
            a=b;
        }
        else{
            a=a;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        gcd=a;
        System.out.println(gcd);
    }
}

4. Number series
