import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println(quotient+" "+remainder);
    }
}
