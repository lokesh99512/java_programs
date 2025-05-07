package Collection.CollectionPractise.LIstInterface;

import java.util.*;
import java.util.stream.Collectors;

public class AssignmentOnList {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(4, 9, 5, 0, 5, 5, 9, 9, 9, 10));
        Vector<Integer> vector1 = new Vector<>(Arrays.asList(9, 8, 100));

        int sum = vector.stream().mapToInt(Integer::intValue).sum();
        int sumEven = vector.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();

        int a = 0;



        // vector.removeAll(vector1);
//
//        System.out.println(vector);
//
//        System.out.println(vector.containsAll(vector));
//
//        List<Integer> integers = vector.stream().filter(i -> Collections.frequency(vector, i) > 1).sorted().distinct().collect(Collectors.toList());
//
//        for (Integer integer : integers) {
//            if (count < vector.stream().filter(i-> i==integer).count()){
//                a=integer;
//                count = (int)vector.stream().filter(i-> i==integer).count();
//                }
//
//        }
//        System.out.println(a);
//
//        Integer z = vector.stream().filter(i -> Collections.frequency(vector, i) > 1).distinct().max(Comparator.naturalOrder()).get();

//        System.out.println(z);
//
//        System.out.println();
//        System.out.println(sumEven);
//        System.out.println(sum);
//        vector1.clear();
//        int n=7;
//        for(int i=1;i<n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//
//
//
//        String s = "basanagouda";
//        List<Character> collectors = new ArrayList<>();
//        for (char ch : s.toCharArray()) {
//            collectors.add(ch);
//        }{
//        StringBuilder output= new StringBuilder();
//        collectors.stream().distinct().forEach(ch-> output.append(collectors.stream().filter(i->i.equals(ch)).count()));
//        System.out.println(output);


        int count;
        Vector<Integer> vector3 = new Vector<>();
        for (int i = 1; i <= 50; i++) {
         count =0;
            for (int j = 1; j <= i; j++){
                if(i%j==0){
                    count++;
                }
                if(count>2){
                    break;
                }
        }
            if(count==2){
                vector3.add(i);
            }
        }
        System.out.println(vector3);


    }

}
