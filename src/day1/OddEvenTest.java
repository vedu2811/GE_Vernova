package day1;

import java.util.Scanner;
public class OddEvenTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Negative");
        }
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
