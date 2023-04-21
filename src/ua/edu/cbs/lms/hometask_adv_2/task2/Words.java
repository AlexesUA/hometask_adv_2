package ua.edu.cbs.lms.hometask_adv_2.task2;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Words {
    List<String> words = new LinkedList<>();

    public boolean addWord(String word){
        try{
            if(word.equals("")) throw new Exception("String can't be empty.");
            return words.add(word);

        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return false;
        }
    }

    public void print(){

        try {
            ListIterator<String> iteratorWords = words.listIterator();

            while (iteratorWords.hasNext()) {
                System.out.println(iteratorWords.next());
            }
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }

    public void doubleValues(){
        try {
            ListIterator<String> iteratorWords = words.listIterator();

            while (iteratorWords.hasNext()) {
                iteratorWords.add(iteratorWords.next());
            }
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }
}
