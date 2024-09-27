package Vecka5.ExerciseFromClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    private List<String> arrayToList(String[]Array){
        //Alt:1 Create ArrayList and Copy from array
        var list = new ArrayList<String>();
        Collections.addAll(list,Array);
        return list;
        //Alt:2 creats list with array as backing array. Creats modifiable list
        //Arrays.asList(array);
        //Creats list and copy each from array. Creats modifiable list
        //Arrays.stream(array).toList();
    }
}
