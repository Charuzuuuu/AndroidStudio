package com.example.androidprojectcollection;

import java.util.Arrays;
import java.util.Scanner;

public class Calculation{

    private String express;

    public Calculation(String value){
        this.express = value;
    }

    public void setData(String value){
        this.express = value;
    }

    public String getResult() {
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        char ch = ' ';
        int oper = 0;
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        while (true) {
            ch = express.substring(index, index + 1).charAt(0);
            if (operStack.isOper(ch)) {
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = operStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }
                } else {
                    operStack.push(ch);
                }
            } else {
                numStack.push(ch - 48);
            }
            index++;
            if (index >= express.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = operStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        return Integer.toString(numStack.pop());
    }
}

class ArrayStack {
    private int MaxSize;
    private int[] arr;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.MaxSize = maxSize;
        arr = new int[MaxSize];
    }


    public boolean isEmpty() {

        return top == -1;
    }

    public boolean isFull() {
        return top == MaxSize - 1;
    }
    public int peek(){
        return arr[top];
    }
    public void push(int val) {
        if (isFull()) {
            System.out.println("The stack is full.~~");
            return;
        }
        top++;
        arr[top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty and can't get out of the stack!");
        }
        int val = arr[top];
        top--;
        return val;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("no data");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public boolean isOper(char oper){
        return oper == '+' || oper == '-' || oper =='*' || oper == '/';
    }

    public int priority(int oper ){
        if(oper == '*' || oper == '/'){
            return 1;
        } else if(oper == '+' || oper == '-'){
            return 0;
        }else {
            return -1;
        }
    }

    public int cal(int num1,int num2,int oper){
        int res = 0;
        switch (oper){
            case '+': res = num1 + num2;
                break;
            case '-': res = num2 - num1;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num2 /num1;
        }
        return res;
    }
}
