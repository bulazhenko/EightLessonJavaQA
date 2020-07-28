package com.customertimes.task4;

//4. Fix the program to make it work:
//public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 4 / a;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//}

public class ClassA {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
    }
}

