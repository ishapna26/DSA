RECURSION : A function calling itself over and over until the specified base condition is reached is called recursion. TWO PHASES: 1. Calling Phase(Eg. Bulb switched on while entering rooms)  
                                                                                                                       2. Returning Phase (Eg. After visiting rooms and while returning bulbs are switched on)
A function that employs that recursion is called as " recursive function. "

Eg. void fun(){
      if(base condition){
       - very important otherwise the recursion will be infinite call;
      }
      1. code //Executes at calling Time. - Ascending phase
      fun()
      2. code //Executes at returning Time. - Descending Phase
   }

Difference Between Loop and a Recursion
  - Loop (Only have ascending phase)
  - A recursion can have both ascending and descending phase
