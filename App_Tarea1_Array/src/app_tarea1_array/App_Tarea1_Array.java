package app_tarea1_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App_Tarea1_Array {

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(1,4,5,5,4,2,1,3));
        for(Integer number: numbersList){
            ArrayList<Integer> tmp = (ArrayList)numbersList.clone();
            tmp.remove(number);
            if (!tmp.contains(number)){
             System.out.println("el valor que no se repite es " + number + " \nindice del numero que no se repita es :" + numbersList.indexOf(number));
             break;
            }
        }

    }
       
       
    
        
        
    }
    

