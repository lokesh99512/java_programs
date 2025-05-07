package Modifiers;

public interface Loki2 extends Loki{

   default String demoLokesh(){
        return "";
    }
    default String loki(){
       Loki.super.loki();
     return "";
    }

}
