class Fibonacci{

   public static int factorial(int n){
      
      int product = 1;
      for(int i=2; i<n; i++){
        product *= i; 
      }  
      
      System.out.println(product);
      return product;
   }
   
   public static int factorialRec(int n) {
       if (n == 1) {
          return 1;
       } else {
           return factorial(n)*factorial(n-1);
      }
   }
   
   public static int fibRecursion(int n){
      
      if(n==0){
        return 0;
      
      }else if(n==1){
        return 1;
      
      }else{
        return fibRecursion(n-1)+fibRecursion(n-2);
      }
      
   }
   
   public static int fibIteration(int n){
    
    if(n<=1) return n;
      
    int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
    return x;   
   }
   
   
   public static void main(String[] args){
      System.out.println(factorial(10));
      System.out.println(fibRecursion(10));
      System.out.println(fibRecursion(10));
      System.out.println(fibIteration(10));
   }

}