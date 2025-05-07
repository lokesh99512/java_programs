package Modifiers;

import org.w3c.dom.ls.LSOutput;

public class Class1 implements Loki,Loki2{

    public static void main(String[] args) {
        String a="123";
        //System.out.println(new StringBuilder(a).reverse());



        Loki2 loki=new Loki2(){};

        int x=10;
        int y=12;
        y=y+x;
        x=y-x;
        y=y-x;

        System.out.println(x);
        System.out.println(y);
    }




    @Override
    public String demoLokesh() {
        return "";
    }

    @Override
    public String loki() {

        return "";
    }
}
