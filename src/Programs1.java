import java.util.*;
import java.util.stream.Collectors;

public class Programs1 extends RuntimeException {

    public static void main(String[] args) {

        String str="lokeshs";


     Character firstNonRepetingChar=   str.chars().mapToObj(i-> (char) i)
                .collect(Collectors.groupingBy(i-> i, LinkedHashMap::new,Collectors.counting()))
             .entrySet().stream().filter(i-> i.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(firstNonRepetingChar);


    }

}





