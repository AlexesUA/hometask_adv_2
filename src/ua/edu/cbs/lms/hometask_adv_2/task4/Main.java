package ua.edu.cbs.lms.hometask_adv_2.task4;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        CitiesAssociation citiesAssociation = new CitiesAssociation();

        citiesAssociation.addAssociation("moskov", "huilo");
        citiesAssociation.addAssociation("Kyiv", "Heroes");
        citiesAssociation.addAssociation("London", "Johnson");
        citiesAssociation.addAssociation("Paris", "Macron");
        citiesAssociation.addAssociation("Varshava", "Duda");
        citiesAssociation.addAssociation("New York", "SpiderMan");

        String key = null, value;

        try{
            do{
                System.out.print("Enter the key: ");
                key = ReplaceFirstSymbol(scInput.nextLine());



            }while (key.equals(null));
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }

        try{
            if(key.equals(null)) throw new Exception("Key is NULL.");

            System.out.println("For key: " + key + ", value: " + citiesAssociation.getAssociation(key));
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }

    }

    static String ReplaceFirstSymbol(String line){
        if(line.indexOf(" ")>=0){
            String[] subLine = line.split(" ");
            String resultLine = "";
            for(int i=0; i<subLine.length; i++){
                if(!subLine[i].equals(" ")){
                    resultLine += toUpperLowerCaseWord(subLine[i]) + " ";
                }
            }
            return resultLine.trim();
        }
        else return toUpperLowerCaseWord(line);
    }

    static String toUpperLowerCaseWord(String word){
        if(word.toLowerCase().equals("moskov")) return word.toLowerCase();                 //Not bug, but feature;
        else return (word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
    }
}
