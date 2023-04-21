package ua.edu.cbs.lms.hometask_adv_2.task4;

import ua.edu.cbs.lms.hometask_adv_2.errorshandling.ErrorsHandling;

import java.util.HashMap;
import java.util.Map;

public class CitiesAssociation {
    private Map<String,String> association = new HashMap<>();

    public boolean addAssociation(String city, String lastName){
        try{
            if(city.equals("") || lastName.equals("")) throw new Exception("Line can't be empty.");
            return association.put(city, lastName)!=null;
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return false;
        }
    }

    public String getAssociation(String city){
        try{
            return association.get(city);
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
            return null;
        }
    }
}
