package dsaPractice;

public class Stack<T> {
    T[] stack;
    int top;
    int capacity;

    Stack(int capacity){
        stack=(T[]) new Object[capacity];    // Generic Object creation but is not recommended..
        this.capacity=capacity;
        top=-1;
    }
    public void push(T a){
        if(isFull()){
            System.out.println("Stack is Full.. Can't add");
        }else{
            stack[++top]=a;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty..");
        }else{
            System.out.println(stack[top]);
            --top;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty..");
        }else{
            System.out.println(stack[top]);
        }
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
