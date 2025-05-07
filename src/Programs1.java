import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programs1 extends RuntimeException {

    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,6,4343,34);

       Integer secondHighest= integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println(secondHighest);

    }

}





