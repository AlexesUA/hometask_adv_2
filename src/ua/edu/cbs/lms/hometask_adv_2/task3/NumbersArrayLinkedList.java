package ua.edu.cbs.lms.hometask_adv_2.task3;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.*;

public class NumbersArrayLinkedList {
    private List<Integer> numbersList = new LinkedList<>();

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

//            Integer minNumber = numbersList.get(0);
//            for(int i=1; i<numbersList.size()-1; i++){
//                if(minNumber > numbersList.get(i)) minNumber = numbersList.get(i);
//            }
//            return minNumber;

            return numbersList.stream().min((o1, o2) -> o1 - o2).get();
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return null;
        }
    }

    public void printArray(){
        ListIterator<Integer> iteratorNumbers = numbersList.listIterator();
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
