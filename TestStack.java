package com.Assem.Lap3;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack = new ArrayStack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input elements" + myStack.isEmpty());
        for (int i = 0; i < 5; i++) {
            myStack.push(in.nextInt());
            System.out.println("top element is =" + myStack.top());
            System.out.println("Stack size is =" + myStack.size());
            System.out.println("is the stack empty ? " + myStack.isEmpty());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Deleted element" + myStack.pop());
            System.out.println("top element is =" + myStack.top());
            System.out.println("Stack size is =" + myStack.size());
            System.out.println("is the stack empty ? " + myStack.isEmpty());
        }
    }
}
