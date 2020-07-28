package com.customertimes.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//6. Write a program that will enter numbers from the keyboard.
//The code for reading numbers from the keyboard must be in the readData method.
//The code inside the readData is wrapped in a try..catch.
//If the user entered some text, instead of entering a number, the method should catch the
// exception and display all previously entered numbers as a result.
//Numbers output from a new line preserving the order of input.

public class ClassA {
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        boolean exitTrigger = false;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number: ");
            result.add(in.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("You entered the incorrect value");
            System.out.println("Previous numbers: " + result.toString());
            exitTrigger = true;
        } finally {
            if (!exitTrigger)
                readData();
        }
    }
}