package practiseJava;


import java.util.*;
import java.util.stream.*;

class Demo {
    public static void main(String args[]) {

        List<Integer> l1=Arrays.asList(1,2,3,4,1,1,1,1,5,6,2,3,4,2,2,2,3,4);
//        List<Integer> output=new ArrayList<>();
//
//        int temp=l1.get(0);
//        int temp1=0;
//
//        for(Integer integer:l1){
//            temp1=integer;
//            if(temp==temp1){
//                output.add(integer);
//            }
//            temp=integer;
//        }
        String str="lokeshisdoingsomething";

        String output=null;
        String temp=null;
        for(int i=0;i<str.length();i++){
            temp=   str.substring(i,i=i+1);
            output += String.valueOf(new StringBuilder(temp).reverse());
        }
        System.out.println(output);


    }
}
