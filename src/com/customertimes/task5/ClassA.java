package com.customertimes.task5;

//5. Throw a NullPointerException from the method iCanThrowException();
//Handle it in the main method.
//public class Main {
//
//    public static void main(String[] args) {
//        iCanThrowException();
//    }
//
//    public static void iCanThrowException() {
//
//    }
//
//}

public class ClassA {
    public static void main(String[] args) {
        try {
            iCanThrowException(null);
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception");
        }
    }

    public static void iCanThrowException(Integer a) {
        int i = a * 10;
    }
}

