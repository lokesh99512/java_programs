package Modifiers;

import Modifiers2.Class2;
import Modifiers3.Class1;

public interface Newinterface {

    String demoLokesh();


    default String getByName(String string){
        return string;
    }

    static String getByStatic(String string){
        return string;
    }
}
