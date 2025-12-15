package dsaPractice;

public class Swapping {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        helper(arr,0);
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void helper(int[] arr,int index){
        if(index==arr.length-1){
            return;
        }
        arr[index]=arr[index]+arr[index+1];
        arr[index+1]=arr[index]-arr[index+1];
        arr[index]=arr[index]-arr[index+1];
        helper(arr,index+1);
    }
}
