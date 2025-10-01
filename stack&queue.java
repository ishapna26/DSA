STACK:
-----
A stack is a Data Structure that is used to store elements in a LAST IN FIRST OUT (LIFO) principle.
operations: push(), pop(), peek(), size()               

stack underflow: When the stack is empty and when you try to pop an element from the stack it is called stack underflow.
stack overflow: When the stack is full (reached the maximum size) and when you try to push some more elements then it is called stack overflow.

Stack Implementation using Array:
----------------------------------
import java.util.*;

class Main{
    static int n=10;
    static int[] stack=new int[n];
    static int top=-1;
    
    public static void main(String[] args){
        push(5);
        peek();
    }
    public static void push(int data){
        if(n>top+1){
            top++;
            stack[top]=data;
        }
        else{
            System.out.print("stack overflow error");
        }
    }
    public static void pop(){
        if(top!=-1){
            top--;
        }
        else{
            System.out.print("stack underflow error");

        }
    }
    public static void peek(){
        if(top!=-1){
            System.out.print(stack[top]);
        }
    }
    public static boolean isEmpty(){
        return top==-1;
    }
}

QUEUE:
-----
A queue is a data structure that is used to store elements using FIFO Principle (FIRST IN FIRST OUT)
operations: enqueue(), dequeue(), front(), isEmpty()

Queue Implemenation using Array:
-------------------------------
