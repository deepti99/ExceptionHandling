
public class ArrayIndexOutOfBoundException {  
  
    public static void main(String[] args) {  
String[] arr = {"Mango","Banana","Strawberry", "Apple", "Pomegranate"};   
//Declaring 5 elements in the String array                                       
          
        //for(int i=0;i<=arr.length;i++) {       
  
//Here, no element is present at the iteration number arr.length, i.e 6  
             System.out.println(arr[0]);   
             System.out.println(arr[1]);
             System.out.println(arr[2]);
             System.out.println(arr[3]);
             System.out.println(arr[4]);
             System.out.println(arr[5]);
//So it will throw ArrayIndexOutOfBoundException at iteration 6           
        }  
  
    }  
  
//}

