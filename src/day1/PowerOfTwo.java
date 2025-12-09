package day1;

import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<31 && n>=0){
            System.out.println("Valid Input");
            for(int i=0;i<n;i++){
                System.out.println((int)(Math.pow(2,i)));
            }
        }else{
            System.out.println("Invalid Input");
        }
    }


}
