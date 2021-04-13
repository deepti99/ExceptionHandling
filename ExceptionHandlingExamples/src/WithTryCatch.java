class WithTryCatch {
	   public static void main (String args[]) {
		      int num1 = 15, num2 = 0, result = 0;
		      
		      System.out.println("The start of the code");
		      try{
		          result = num1/num2;
		          System.out.println("The result is" +result);
		      } 
		      catch (ArithmeticException e) {
		         System.out.println ("Can't be divided by Zero: Here the exception is handled " + e);
		      }
		      System.out.println("Now the Rest of the code will get executed without unwanted termination");
		      System.out.println("The end of the code");
		   }
		} 
   



