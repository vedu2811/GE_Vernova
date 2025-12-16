package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int m,n;
        m=5;
        n=0;
        try {
            System.out.println(m / n);  //Unchecked Exception - Arithmetic Exception
        }catch(Exception e){
            System.out.println("Exception Handled");
        }finally {
            // it is a block of code which executes irrespective of any error..
            // used for memory closures and ending logs
            System.out.println("Bye");
        }
        System.out.println("Bye bye");
    }
}
