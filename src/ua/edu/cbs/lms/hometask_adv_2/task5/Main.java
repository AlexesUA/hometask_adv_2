package ua.edu.cbs.lms.hometask_adv_2.task5;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        List<String> lines = new LinkedList<>();

        try{
            String tempLine = "end";
            do{
                tempLine = scInput.nextLine();
                if(!tempLine.toLowerCase().equals("end")) break;
                lines.add(tempLine);
            }while(true);

        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }

        try{
            if(lines.isEmpty()) throw new Exception("Lines array is empty.");
            for(String line: lines){
                System.out.println(line);
            }
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }
}
