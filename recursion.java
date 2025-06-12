RECURSION : A function calling itself over and over until the specified base condition is reached is called recursion. TWO PHASES: 1. Calling Phase(Eg. Bulb switched on while entering rooms)  
                                                                                                                       2. Returning Phase (Eg. After visiting rooms and while returning bulbs are switched on)
A function that employs that recursion is called as " recursive function. "

Eg. void fun(){
      if(base condition){
       - very important otherwise the recursion will be infinite call;
      }
      1. code //Executes at calling Time. - Ascending phase (GETS EXECUTED WHEN THE FUNCTION IS CALLED)
      fun()
      2. code //Executes at returning Time. - Descending Phase (GETS EXECUTED WHEN THE FUNCTION IS RETURNING)
   }

Difference Between Loop and a Recursion
  - Loop (Only have ascending phase)
  - A recursion can have both ascending and descending phase

HOW TO SOLVE ANY RECURSIVE PROBLEMS:
-----------------------------------
1. Break the problem into smaller problem.
2. Build Logic behind the smaller problem.
3. Find the recursive step for given problem.
4. Find base condition.
5. Build recursive tree.

  
