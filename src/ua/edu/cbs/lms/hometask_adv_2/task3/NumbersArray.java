package ua.edu.cbs.lms.hometask_adv_2.task3;


import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumbersArray {
    private Set<Integer> numbersList = new TreeSet<>();

    public boolean getIntegerList(int count){
        try{
            if(count<=0) throw new Exception("Cont can't be equals to or less than 0.");

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
            if(!numbersList.iterator().hasNext()) throw new Exception("Arrays is null.");
            return numbersList.iterator().next();
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return null;
        }
    }

    public void printArray(){
        Iterator<Integer> iteratorNumbers = numbersList.iterator();
        int newLineMarker = 30;

        while (iteratorNumbers.hasNext()){
            System.out.print("[" + iteratorNumbers.next() + "] ");
            newLineMarker--;
            if(newLineMarker <= 0){
                System.out.println();
                newLineMarker = 30;
            }
        }

    }
}
