public int sum(int n) { 
    if (n == 0) {            
    return 0;          
     }         
   else {    
    return n + sum(n); 
    //This would call sum(n) with the same value of n, causing infinite recursion.
    //Corrected Version:
    //return n + sum(n - 1);
    //This correctly reduces the problem size in each recursive step, eventually reaching the base case.

  
   }   
}