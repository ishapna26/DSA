INTRODUCTION TO DSA:
Data: Data is an important part of the program
Program: A program is a set of instructions which performs operation on data.
Data Structure: The way you organize data in main memory during execution time of a program. (Two types: Physical DS and Logical DS) / structured way to store data. 
                                                                                                             |             |
                                                 (How the data is arranged in the memory- Arrays, Matrices, Linked List) (How the data can be arranged and utilized- Stack,Queues, Graphs, Trees, Hashing).

Recursion usually felt inefficient because it uses stacK DS internally, (not useful for solving larger problems)

INTRODUCTION TO ARRAYS:
Arrays: Arrays are defined as a collection of "similar" data items stored "contiguously" in the memory blocks.
in c: int arr[10]; -> declaration int arr[3]={0,1,2} -> Declaration and Initialization;

Why we store same DataType in a Array? Since array stores memory contiguously the data type needs to be same.
How to access an element in an array? Through Index -> arr[3]. Initially the array stores the starting elements address. eg. Assume 100 is the starting element address. Then arr[3] address will be calculated 
                                                                                                                             by 100+(3(index)*4(int datatype size=4bytes))=100+12=112(4 th elements address)


  
