package org.example;

public class Stack <T>{
    T[] arr1 = (T[])new Object[100];

    //we have to fill the elements of our stack from top and remove elements from top

    int top = -1;

    public void push(T a){
        if(top==arr1.length-1){
            System.out.println("Stack is full cannot add");
        }else{
            top = top+1;
            arr1[top] = a;
        }
    }
    //peek is a function which is used to see the topmost element of the stack
    public void peek(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(arr1[top]);
        }
    }

    //it removes the top most element
    public T pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }else{
            T r = arr1[top];
            top = top -1;
            return r;

        }
    }
}
