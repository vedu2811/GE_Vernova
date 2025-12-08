package lineComparison;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println("Welcome to Line Comparison");
        Main n1=new Main();
        Line l1=new Line(n1.getPoint(),n1.getPoint());
        l1.calculateLength();
        Line l2=new Line(n1.getPoint(),n1.getPoint());
        l2.calculateLength();
        if(l1.length>l2.length){
            System.out.println("Line 1 is larger");
        }else if(l1.length<l2.length){
            System.out.println("Line 2 is larger");
        }else{
            System.out.println("Equal length of both lines");
        }
    }
    public Point getPoint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x coordinate");
        double x1=sc.nextDouble();
        System.out.println("Enter y coordinate");
        double y1=sc.nextDouble();
        Point p1=new Point(x1,y1);
        return p1;
    }
}
