package ua.edu.cbs.lms.hometask_adv_2.task3;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        NumbersArray numArray = new NumbersArray();

        try{
            do {
                System.out.print("Enter count of random numbers: ");

            }while (!numArray.getIntegerList(scInput.nextInt()));
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }

        System.out.println("Your numbers array: ");
        numArray.printArray();

        System.out.println("\n\nMinimal number is: " + numArray.getMinimalNumber());
    }
}
