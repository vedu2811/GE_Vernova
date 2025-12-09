package day1;

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double val=0;
        int n=sc.nextInt();
        if(n>0){
            System.out.print("1/1 + ");
            for(int i=2;i<n;i++){
                System.out.print("1/"+i+" +");
                val = val+ (double) 1/i;
            }
            System.out.println("1/"+n);
            val=val + (double) 1/n;
            System.out.println(val);
        }
    }
}
