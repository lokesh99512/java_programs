import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programs {

   public static int calc() {
        try {
            return 10;
        } catch(Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    public static void main(String[] args) {

        String str = "swiss";



       Character ch= str.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(i-> i,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i-> i.getValue()==1).map(i-> i.getKey()).findFirst().orElse(null);
        System.out.println(ch);

        Character collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(collect);


        Map<Character, Integer> characterLongMap = new LinkedHashMap<>();
        str.chars().mapToObj(i -> (char) i).forEach(i -> {
            characterLongMap.put(i, characterLongMap.getOrDefault(i, 0) + 1);
        });
        Character character = null;
        for (Map.Entry<Character, Integer> characterIntegerEntry : characterLongMap.entrySet()) {
            if (characterIntegerEntry.getValue() == 1) {
                character = characterIntegerEntry.getKey();
                break;
            }
        }
        System.out.println(character);

        String sentence = "java is java and java is fun";

        Map<String, Long> collect1 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(collect1);

        List<Integer> list = List.of(5, 3, 9, 1, 7);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println(list.stream().sorted(Comparator.naturalOrder()).toList());

        List<String> stringList = List.of("Java", "Python", "Java", "C++", "Python");

        List<String> list1 = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(list1);
        List<List<String>> listList = List.of(List.of("A", "B"), List.of("C", "D"));

        Set<String> collect2 = listList.stream().flatMap(Collection::stream).collect(Collectors.toSet());
        System.out.println(collect2);

        System.out.println(calc());

        //
        List<Employee> employees = new ArrayList<>();


        employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        employees.stream().
                sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

        List<String> values = Arrays.asList("10", "20", "not-a-number");


        List<String> stringLis1t= values.stream().filter(i-> {
            try {
                Integer.valueOf(i);
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(stringList);


    }


}
