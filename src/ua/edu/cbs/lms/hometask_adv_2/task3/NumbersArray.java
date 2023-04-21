package ua.edu.cbs.lms.hometask_adv_2.task3;


import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumbersArray {
    Set<Integer> numbersList = new TreeSet<>();

    public boolean getIntegerList(int count){
        try{
            Random rndNumber = new Random();

            for(int i=0; i<count; i++){
                numbersList.add(rndNumber.nextInt(-100, 100));
            }
            return true;
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return false;
        }
    }

    public Integer getMinimalNumber(){
        try {
            return numbersList.iterator().next();
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return null;
        }
    }
}
