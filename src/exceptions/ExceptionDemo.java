package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        try{
            if(a%2==0){
                throw new CustomException("Entered number is even");
            }else{
                System.out.println(a);
            }
        }catch(CustomException e){
            System.out.println("Custom Exception Caught");
        }
//            int m, n;
//            m = 5;
//            n = 0;
            // How to write your Exception



//        try {
//            System.out.println(m / n);  //Unchecked Exception - Arithmetic Exception
//        }catch(Exception e){
//            System.out.println("Exception Handled");
//        }finally {
//            // it is a block of code which executes irrespective of any error..
//            // used for memory closures and ending logs
//            System.out.println("Bye");
//        }
    }
}
