package com.Assem.Lap3;

import java.util.Scanner;

public class CopyStack {
    public static void main(String[] args) {
        ArrayStack<Integer> stack1 = new ArrayStack<>();
        ArrayStack<Integer> stack2 = new ArrayStack<>();
        Scanner in  = new Scanner(System.in);
        System.out.print("inter the stack elements:");
        for (int i = 0; i < 5; i++) {
            stack1.push(in.nextInt());
            System.out.println("the top element is = " + stack1.top());
            System.out.println("the stack size is = " + stack1.size());
            System.out.println("is the stack is empty ? " + stack1.isEmpty());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            stack2.push(stack1.pop());
            System.out.println("the top element is = " + stack2.top());
            System.out.println("the stack size is = " + stack2.size());
            System.out.println("is the stack is empty ? " + stack2.isEmpty());
            System.out.println();
        }

     }
}
