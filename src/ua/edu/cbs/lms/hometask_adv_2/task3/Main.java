package ua.edu.cbs.lms.hometask_adv_2.task3;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        NumbersArray numArray = new NumbersArray();

        System.out.print("Enter count of random numbers: ");
        try{
            numArray.getIntegerList(scInput.nextInt());
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }
}
