package ua.edu.cbs.lms.hometask_adv_2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        Scanner scInput = new Scanner(System.in);

        System.out.println("Enter 5 words to the keyboard (Split their 'enter' key): ");

        int indexWord = 1;

        while (indexWord<6){
            System.out.print(indexWord + ": ");
            if(words.addWord(scInput.nextLine())) indexWord++;
        }


        System.out.println("\nBefore double:");
        words.print();

        words.doubleValues();

        System.out.println("\nAfter double:");
        words.print();
    }
}
