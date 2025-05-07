import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaProgram {


    public static void findLeader(int[] arr) {
        int n = arr.length;
        int maxSize = arr[n - 1];
        System.out.println(maxSize);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxSize) {
                maxSize = arr[i];
                System.out.println(maxSize);
            }
        }
    }
    public static void main(String[] args) {
//
//        1.Program to print leaders in an array. Leader is the element to which all elements are smaller. Last element is always the leader.
//        Arr =  [16, 17,  4, 6, 5,  2]     output =  17, 6, 5, 2

        int[] arr = {16, 15, 6, 5, 5};  // output = 16,15,6,5

        findLeader(arr);

//        Second highest salary
//        List<Integer> salaries = Arrays.asList(3000, 4000, 2000, 5000, 4000);
//        System.out.println(salaries);
//        Optional<Integer> secondHighSalary = salaries.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//        System.out.println(secondHighSalary.get());
//
//
        List<User> users = Arrays.asList(
                new User("Alice", "Delhi"),
                new User("Bob", "Mumbai"),
                new User("Charlie", "Delhi")
        );
//

        //   Map<String, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getCity));


//
//        Map<String, List<User>> stringListMap = users.stream().collect(Collectors.groupingBy(User::getCity));


        //Output
//        {
//            "Delhi": [Alice, Charlie],
//            "Mumbai":[bob]
//        }


//        Write a program that prints numbers from 1 to N, where:
//        1. If the number is divisible by 3, print "Foo" instead of the number.
//        2. If the number is divisible by 5, print "Boo" instead of the number.
//        3. If the number is divisible by both 3 and 5, print "FooBoo".
//        4. Otherwise, print the number itself.

//        int n = 15;
//
//        for (int i = 0; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FooBoo");
//            } else if (i % 3 == 0) {
//                System.out.println("Foo");
//            } else if (i % 5 == 0) {
//                System.out.println("Boo");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//

//        1. Find Even Numbers from a List


        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> integers = nums.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(integers);


        //      2.  Find the First Non-Repeating Character

        String input = "programming";

        Character output = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(output);

        // 3. Count Word Frequency in a Sentence


        String sentence = "java is java and java is fun";
        Map<String, Long> stringLongMap =
                Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(stringLongMap);

        //4. Find Max and Min
        List<Integer> list = List.of(5, 3, 9, 1, 7);

        int max = list.stream().distinct().max(Integer::compare).get();
        int min = list.stream().distinct().min(Integer::compare).get();
        System.out.println(max);
        System.out.println(min);
// 5. Sort List in Descending Order

        System.out.println(list.stream().sorted().toList());
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).toList());
//        6. Group By Example (Employee by Department)

        List<User> userss = Arrays.asList(
                new User("Alice", "Delhi"),
                new User("Bob", "Mumbai"),
                new User("Charlie", "Delhi")
        );
        Map<String, List<User>> grouped = userss.stream()
                .collect(Collectors.groupingBy(User::getCity));
        System.out.println(grouped);

//        7. Convert List to Map

        List<String> names = List.of("A", "B", "C");

        Map<String, Integer> map = names.stream().collect(Collectors.toMap(i -> i, String::length));
        System.out.println(map);

        //8. Find Duplicate Elements

        List<String> stringList = List.of("Java", "Python", "Java", "C++", "Python");
        Set<String> duplicates = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);  // [Java, Python]

        //9. Flatten a List of Lists (flatMap)
        List<List<String>> listList = List.of(List.of("A", "B"), List.of("C", "D"));
        Set<String> singleList = listList.stream().flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(singleList);

        int sum = List.of(1, 2, 3, 4).stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

        Integer a=120;
        Integer b=120;

        System.out.println(a==b);

        Integer c=128;
        Integer d=128;

        System.out.println(c==d);


        //        String str = "LokeshK456KK66sh45";
//
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(str);
//
//        int sum = 0;
//
//        while (matcher.find()) {
//            sum += Integer.parseInt(matcher.group());
//        }
//
//        System.out.println(sum);

//        List<Integer> characters = str.chars().mapToObj(i -> (char) i).map(i -> {
//            try {
//                return Integer.valueOf(i);
//            } catch (NumberFormatException e) {
//                return 0;
//            }
//        }).collect(Collectors.toList());
//
//
//        int sum = 0;
//
//        for (Integer character : characters) {
//            sum += character;
//        }
//
//        System.out.println(sum);


//        for (int i = 2; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//
//        }


        String str = "Lokesh";

        Character collect = str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        //  System.out.println(collect);

        System.out.println(findFirstNonRepetingLetter(str));


    }
    public static Character findFirstNonRepetingLetter(String str) {
        Map<Character, Long> characterLongMap = new LinkedHashMap<>();
        str.chars().forEach(i -> {
            characterLongMap.put((char) i, characterLongMap.getOrDefault(i, 0L) + 1);
        });
        for (Map.Entry<Character, Long> characterLongEntry : characterLongMap.entrySet()) {
            if (characterLongEntry.getValue() == 1) {
                return characterLongEntry.getKey();
            }
        }
        return null;
    }

//    public static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i < Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}