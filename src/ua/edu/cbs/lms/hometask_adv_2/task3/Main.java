package ua.edu.cbs.lms.hometask_adv_2.task3;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        NumbersArray numArray = new NumbersArray();
        NumbersArrayLinkedList numArrayLL = new NumbersArrayLinkedList();

        try{
            do {
                System.out.print("Enter count of random numbers: ");

            }while (!numArray.getIntegerList(scInput.nextInt()));
            numArrayLL.getIntegerList(numArray.getCount());
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }


        System.out.println("Your numbers TreeSet array: ");
        numArray.printArray();

        System.out.println("\n\nMinimal number is: " + numArray.getMinimalNumber());

        System.out.println("\n\nYour numbers LinkedList array: ");
        numArrayLL.printArray();

        System.out.println("\n\nMinimal number is: " + numArrayLL.getMinimalNumber());
    }
}
