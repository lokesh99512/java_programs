package Modifiers;

import java.util.HashMap;

public class Class2 extends Class1{

    public static void main(String[] args) {
        HashMap<Integer,String> integerStringHashMap=new HashMap<>();
        integerStringHashMap.put(1,"demo");
        integerStringHashMap.put(2,"demo1");
        integerStringHashMap.put(null,null);
        integerStringHashMap.put(1,"demo");
        System.out.println(integerStringHashMap);
    }


}
