package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("alma");
        myStack.push("armud");
        myStack.push("heyva");
        myStack.push("nar");

        System.out.println(myStack.pop());
        myStack.push("encir");

        myStack.showElements();

        myStack.push("ananas");
        myStack.showElements();
        System.out.println(myStack.pop());
        myStack.showElements();
    }

}
