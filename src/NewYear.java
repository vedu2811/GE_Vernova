import java.util.Scanner;
public class NewYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int y=sc.nextInt();
        if(y>999 && y<10000){
            System.out.println("Year is Valid");
            if(y%4==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a leap year");
            }
        }else{
            System.out.println("Invalid Year");
        }
    }

}
