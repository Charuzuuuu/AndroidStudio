package com.example.projectcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.*;

public class Calculations {

    String str;

    public Calculations(String str){
        this.str = str;
    }

    public Calculations(){}

    public double solCalculate(){

        double operand2, operand1, convert;
        double res = 0;
        char sign = 'c';

        List<Character> oper = new ArrayList<>();

        Stack<Double> nums = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '*' && str.charAt(i) != '/'){
                sb.append(str.charAt(i));
            }else{
                convert = Double.parseDouble(sb.toString());
                nums.push(convert);
                sb.delete(0, sb.length());

                if(nums.size() == 2){
                    operand2 = nums.pop();
                    operand1 = nums.pop();
                    if(sign == '+'){
                        System.out.println("Plus");
                        res = operand1 + operand2;
                        nums.push(res);
                    }else if(sign == '-'){
                        System.out.println("Minus");
                        res = operand1 - operand2;
                        nums.push(res);
                    }else if(sign == '*'){
                        System.out.println("Product");
                        res = operand1 * operand2;
                        nums.push(res);
                    }else if(sign == '/'){
                        System.out.println("Quotient");
                        res = operand1 / operand2;
                        nums.push(res);
                    }
                }

                sign = str.charAt(i);
                oper.add(str.charAt(i));
            }
        }

        convert = Double.parseDouble(sb.toString());
        nums.push(convert);
        sb.delete(0, sb.length());

        int size = oper.size();

        if(oper.get(oper.size()-1) == '+'){
            System.out.println("Add");
            operand2 = nums.pop();
            operand1 = nums.pop();
            res = operand1 + operand2;
            nums.push(res);
        }else if(oper.get(oper.size()-1) == '-'){
            System.out.println("Subt");
            operand2 = nums.pop();
            operand1 = nums.pop();
            res = operand1 - operand2;
            nums.push(res);
        }else if(oper.get(oper.size()-1) == '*'){
            System.out.println("Mult");
            operand2 = nums.pop();
            operand1 = nums.pop();
            res = operand1 * operand2;
            nums.push(res);
        }else if(oper.get(oper.size()-1) == '/'){
            System.out.println("Div");
            operand2 = nums.pop();
            operand1 = nums.pop();
            res = operand1 / operand2;
            nums.push(res);
        }

        return nums.pop();


    }

    public boolean isValidEquation(String equation) {
        String regex = "(?<![+\\-*/])[0-9]+[+\\-*/][0-9]+(?:[+\\-*/][0-9]+)*(?![+\\-*/])";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(equation);    

        return matcher.matches();
    }

    public double resCalculate(){

        Stack<Double> nums = new Stack<>();
        Stack<Character> operStack = new Stack<>();
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        double convert, operand1, operand2;
        double res = 0;
        char current = 'c';

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '*' && str.charAt(i) != '/') {
                sb.append(str.charAt(i));
            } else {
                if (current != 'c') {
                    if(str.charAt(i) == '+' || str.charAt(i) == '-'){
                        operStack.push(str.charAt(i));
                    }
                    convert = Double.parseDouble(sb.toString());
                    nums.push(convert);
                    sb.delete(0, sb.length());
                    operand2 = nums.pop();
                    operand1 = nums.pop();
                    if (current == '*') {
                        res = operand1 * operand2;
                        nums.push(res);
                        if(str.charAt(i) == '*'){
                            current = str.charAt(i);
                        }else if(str.charAt(i) == '/'){
                            current = str.charAt(i);
                        }else{
                            current = 'c';
                        }
                    } else if (current == '/') {
                        res = operand1 / operand2;
                        nums.push(res);
                        if(str.charAt(i) == '*'){
                            current = str.charAt(i);
                        }else if(str.charAt(i) == '/'){
                            current = str.charAt(i);
                        }else{
                            current = 'c';
                        }
                    }
                }else if (str.charAt(i) == '*' || str.charAt(i) == '/') {
                    convert = Double.parseDouble(sb.toString());
                    nums.push(convert);
                    sb.delete(0, sb.length());
                    current = str.charAt(i);
                }else{
                    convert = Double.parseDouble(sb.toString());
                    nums.push(convert);
                    sb.delete(0, sb.length());
                    operStack.push(str.charAt(i));
                }
            }
        }

        if(current != 'c'){
            convert = Double.parseDouble(sb.toString());
            nums.push(convert);
            sb.delete(0, sb.length());
            if(current == '*'){
                operand2 = nums.pop();
                operand1 = nums.pop();
                res = operand1 * operand2;
                nums.push(res);
            }else if(current == '/'){
                operand2 = nums.pop();
                operand1 = nums.pop();
                res = operand1 / operand2;
                nums.push(res);
            }
        }else{
            convert = Double.parseDouble(sb.toString());
            nums.push(convert);
            sb.delete(0, sb.length());
        }

        for(int i = nums.size()-1; i >= 0; i--){
            String val1 = String.valueOf(nums.pop());
            arr.add(val1);
            if(!operStack.isEmpty()){
                String val2 = String.valueOf(operStack.pop());
                arr.add(val2);
            }
        }

        for(String i : arr){
            if(i.matches("[+-/]")){
                char op = i.charAt(0);
                operStack.push(op);
            }
        }

        for(String i : arr){
            try {
                double n = Double.parseDouble(i);
                nums.push(n);
            } catch (NumberFormatException e) {
            }
        }

        int size = nums.size();

        do{
            char cur = operStack.pop();
            if(cur == '+'){
                operand1 = nums.pop();
                operand2 = nums.pop();
                res = operand1 + operand2;
                nums.push(res);
            }else if(cur == '-'){
                operand1 = nums.pop();
                operand2 = nums.pop();
                res = operand1 - operand2;
                nums.push(res);
            }
        }while (!operStack.isEmpty());




        return nums.pop();
    }

}
