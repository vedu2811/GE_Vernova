import java.util.*;
public class Factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("No prime factors");
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                if(!list.contains(i)){
                    list.add(i);
                }
                n/=i;
            }
        }
        for(int i:list){
            System.out.println(i+" ");
        }
        if(n>1) {
            System.out.println(n);
        }
    }
}
