//David Semchishin
//Java Project 1
//2/6/2023

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
        System.out.println("Please make your choice: ");

        int userInput = input.nextInt();
        input.nextLine();


        while (true) {
            if (userInput == 1) {
                addTask(myList);

            } else if (userInput == 2) {
                removeTask(myList);

            } else if (userInput == 3) {
                updateTask(myList);

            } else if (userInput == 4) {
                System.out.println(myList);

            } else if (userInput == 0) {
                System.exit(0);
            }
            System.out.println("Please make your choice: ");
            userInput = input.nextInt();
            input.nextLine();
        }

    }

    static ArrayList<String> addTask(ArrayList<String> a) {
        System.out.println("Please enter task you'd like to add: ");
        String task = input.nextLine();
        a.add(task);
        return a;
    }

    static ArrayList<String> removeTask(ArrayList<String> a) {
        System.out.println("Please enter the task you'd like to remove: ");
        String task = input.nextLine();
        a.remove(task);
        return a;
    }

    static ArrayList<String> updateTask(ArrayList<String> a) {
        System.out.println("What index would you like to replace: ");
        int ind = input.nextInt();
        input.nextLine();

        System.out.println("What would you like to update it to: ");
        String update = input.nextLine();

        a.set(ind, update);
        return a;
    }
}
